package constructorreference.constructor.singleton.lazyinitialization;

public class SingletonLI {

    private static SingletonLI sSoleInstance;

    private SingletonLI(){
		System.out.println("from singleton Lazy initialization constructor");
	}  //private constructor.

    public static SingletonLI getInstance(){
        if (sSoleInstance == null){ //if there is no instance available... create new one
            sSoleInstance = new SingletonLI();
        }

        return sSoleInstance;
    }
}