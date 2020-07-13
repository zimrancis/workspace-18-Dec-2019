package com.dmitrykhramov.spring.converters;

import com.dmitrykhramov.spring.domain.User;
import com.dmitrykhramov.spring.domain.security.Role;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by Dmitry on 12.01.2017.
 */
public class UserToUserDetailsConcerterTest {

    private Converter<User, UserDetails> converter;

    @Before
    public void setUp() throws Exception {
        converter = new UserToUserDetails();
    }

    @Test
    public void testUserConvert() throws Exception {

        String userName = "Fred";
        String password = "password";
        String roleName1 = "USER";
        String roleName2 = "ADMIN";
        Role role1 = new Role();
        role1.setRole(roleName1);
        Role role2 = new Role();
        role2.setRole(roleName2);

        User user = new User();
        user.setUsername(userName);
        user.setEncryptedPassword(password);
        user.addRole(role1);
        user.addRole(role2);

        UserDetails userDetails = converter.convert(user);

        assert userDetails.getUsername().equals(userName);
        assert userDetails.getPassword().equals(password);
        assert userDetails.getAuthorities().size() == 2;
    }
}
