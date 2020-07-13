package object.fourways.to.create.objects;

class Student {
	/*public Student(int i){
	}*/
}

class Customer2 {
}

class ObjectCreationFromConsole {
	//public ObjectCreationFromConsole(){
	/*public ObjectCreationFromConsole(int i){
		System.out.println("no-argument-constructor");
	}*/
	public static void main(String... zobair)throws Exception {
		@SuppressWarnings("deprecation")
		Object o = Class.forName(zobair[0]).newInstance();
		System.out.println("Object created for: " + o.getClass().getName());
		//ObjectCreationFromConsole o = new ObjectCreationFromConsole();
		System.out.println("default constructor is created");
	}
}
