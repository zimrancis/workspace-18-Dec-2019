/**
 * Way 4: Using Reflection & newInstance() method of Class & Constructor

There are different variants while dealing with reflection way of creating objects i.e.;

Using Classes & Constructors:

    Using Class.forName(“fully.qualified.name.of.class”).newInstance();
    Using <ClassName>.class.newInstance();
    Using <ClassName>.class.getClassLoader().loadClass(“fully.qualified.name.of.class”).newInstance();
    Using Constructor i.e.;
    Constructor<<className>> constructor = <ClassName>.class.getConstructor();
    <ClassName> object44 = constructor.newInstance();

 

Pre-requisite:

To create Object using reflection & newInstance() method way, we require below 2 things in advance

    Fully qualified class name
    default public constructor, because newInstance() method invokes default no-arg constructor while creating Object

 * 
 * 
 * Way 4.1: Reflection – Class.forName(“className”).newInstance();

This type of Object creation is commonly encountered while connecting database at a lower level i.e.; for loading & creating Object of that particular driver type

Loading –> Class.forName(“fully.qualified.class.name”)
Creating –> invoking newInstance() method on that particular loaded class

For example,

    Oracle –> oracle.jdbc.driver.OracleDriver
    MySQL –> com.mysql.jdbc.Driver
    SQL Server –> com.microsoft.sqlserver.jdbc.SQLServerDriver
    MS Access –> sun.jdbc.odbc.JdbcOdbcDriver

*
*/
package object.fourways.to.create.objects;


public class UsingClassForNameOfReflection {
 
    // public no-arg constructor
    public UsingClassForNameOfReflection() {
        System.out.println("newInstance() method invokes: "
                + "default no-arg constructor");
    }
 
    public static void main(String[] args) {
 
        try {
            // Way 4.1: Class.forName("className").newInstance()
            @SuppressWarnings("deprecation")
			UsingClassForNameOfReflection object41 = 
            (UsingClassForNameOfReflection) Class.forName(
            "in.bench.resources.reflection"
            + ".UsingClassForNameOfReflection")
            .newInstance();
 
            // invoking display() method
            object41.display();
        } 
        catch (InstantiationException iex) {
            iex.printStackTrace();
        } 
        catch (IllegalAccessException iaex) {
            iaex.printStackTrace();
        } 
        catch (ClassNotFoundException cnfex) {
            cnfex.printStackTrace();
        }
    }
 
    // display() method to test
    public void display(){
        System.out.println("Way 4.1: "
                + "using Class.forName(className).newInstance()");
    }
}
/**
 * 
 * Output:
	
newInstance() method invokes: default no-arg constructor
Way 4.1: using Class.forName(className).newInstance()

Explanation:

    We have explicitly provided a default no-arg constructor at line no. 6
    But if we haven’t coded any explicit constructor in the class, then compiler (or JVM) inserts a default no-arg constructor (provided there is no parameterized constructor)
    Line no. 14 creates an Object using newInstance() method after loading respective class using Class.forName(“fully.qualified.name.of.class”)
    When newInstance() method is executed then it invokes public default no-arg constructor
    After object creation step, using object reference we are invoking display() method to print simple message in the console

*/