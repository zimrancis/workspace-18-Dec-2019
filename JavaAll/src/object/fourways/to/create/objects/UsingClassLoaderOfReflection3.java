/**
 * 
 * Way 4.3: Reflection – using class loader

This is again very similar to earlier approaches (4.1 & 4.2), but here it uses class loader to load class

Loading –> <ClassName>.class.getClassLoader().loadClass(“qualified.class.name”)
Creating –> invoking newInstance() method on that particular loaded class
*/

package object.fourways.to.create.objects;

public class UsingClassLoaderOfReflection3 {
	 
    // public no-arg constructor
    public UsingClassLoaderOfReflection3() {
        System.out.println("newInstance() method invokes: "
                + "default no-arg constructor");
    }
 
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
 
        // local variable
        Object object = null;
 
        try {
            // Way 4.3: using class loader
            object = UsingClassLoaderOfReflection3.class
                    .getClassLoader().loadClass(
                    "in.bench.resources.reflection"
                    + ".UsingClassLoaderOfReflection")
                    .newInstance();
 
            // type-cast to required type from Object
            UsingClassLoaderOfReflection3 object43 = 
                    (UsingClassLoaderOfReflection3) object;
 
            // invoking display() method
            object43.display();
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
        System.out.println("Way 4.3: using class loader;");
    }
}

/**
 *Output:

	
newInstance() method invokes: default no-arg constructor
Way 4.3: using class loader;

Explanation:

    We have explicitly provided a default no-arg constructor at line no. 6
    But if we haven’t coded any explicit constructor in the class, then compiler (or JVM) inserts a default no-arg constructor (provided there is no parameterized constructor)
    Line no. 17 creates an Object using newInstance() method, after loading respective class using class loader
    When newInstance() method is executed then it invokes public default no-arg constructor
    After object creation step, using object reference we are invoking display() method to print simple message in the console

  
 * 
 */
