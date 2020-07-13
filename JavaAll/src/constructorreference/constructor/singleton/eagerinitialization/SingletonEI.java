package constructorreference.constructor.singleton.eagerinitialization;

public class SingletonEI {

    private static volatile SingletonEI sSoleInstance = new SingletonEI();

    //private constructor.
    private SingletonEI(){
		System.out.println("from singleton Eager initialization constructor");
	}

    public static SingletonEI getInstance() {
        return sSoleInstance;
    }
}