package net.guides.springboot2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import net.guides.springboot2.springboot2jpacrudexample.model.repository.EmployeeRepository;

@SpringBootApplication
public class Springboot2JpaCrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2JpaCrudExampleApplication.class, args);
	}
	
	// init bean to insert 3 books into h2 database.
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            repository.save(new Employee("Zobair", "Imran", "zim@gmail.com"));
            repository.save(new Employee("Omar", "Sufian", "omr@gmail.com"));
            repository.save(new Employee("Imtiaz", "Jewel", "jew@gmail.com"));
        };
    }

}
