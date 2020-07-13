/**
 * 
 * Way 4.4: Reflection – using constructor with generics

In all earlier reflection approach, we have used only class name to load class and later creating/instantiating Object using newInstance() method. But here, we are going to use Constructor to load class in a reflective way

Loading –> <ClassName>.class.getConstructor()
Creating –> invoking newInstance() method on that particular loaded class (via Constructor)
*/

package object.fourways.to.create.objects;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
 
public class UsingConstructorOfReflection4 {
 
    // public no-arg constructor
    public UsingConstructorOfReflection4() {
        System.out.println("newInstance() method invokes: "
                + "default no-arg constructor");
    }
 
    public static void main(String[] args) {
 
        try {
            // Way 4.4: using newInstance() method of Constructor
            Constructor<UsingConstructorOfReflection4> constr = 
                    UsingConstructorOfReflection4.class
                    .getConstructor();
 
            // invoking newInstance() method using Reflection
            UsingConstructorOfReflection4 object44 = 
                    constr.newInstance();
 
            // invoking display() method
            object44.display();
        } 
        catch (InstantiationException iex) {
            iex.printStackTrace();
        } 
        catch (IllegalAccessException iaex) {
            iaex.printStackTrace();
        } 
        catch (IllegalArgumentException iargex) {
            iargex.printStackTrace();
        } 
        catch (InvocationTargetException itex) {
            itex.printStackTrace();
        }
        catch (NoSuchMethodException nsmex) {
            nsmex.printStackTrace();
        } 
        catch (SecurityException sex) {
            sex.printStackTrace();
        }
    }
 
    // display() method to test
    public void display(){
        System.out.println("Way 4.4: "
                + "using newInstance() method of Constructor");
    }
}

/***
 * Output:
?
1
2
	
newInstance() method invokes: default no-arg constructor
Way 4.4: using newInstance() method of Constructor

Explanation:

    We have explicitly provided a default no-arg constructor at line no. 9
    But if we haven’t coded any explicit constructor in the class, then compiler (or JVM) inserts a default no-arg constructor (provided there is no parameterized constructor)
    Line no. 17 & 21 creates an Object using newInstance() method, after loading respective class via Constructor-way
    When newInstance() method is executed then it invokes public default no-arg constructor
    After object creation step, using object reference we are invoking display() method to print simple message in the console

 * */

/**
 * 
 * 
 * Exception for reflection API and newInstance() method

    While creating Object using reflection API & newInstance() method, definitely a default no-arg constructor is required
    It can be explicit default constructor coded in the class by programmer or else JVM provided default no-arg constructor at compile-time
    In any case, if the corresponding class doesn’t contains default no-arg constructor then at run-time, a exception is thrown stating reason “java.lang.NoSuchMethodException” as shown in the below figure
*/