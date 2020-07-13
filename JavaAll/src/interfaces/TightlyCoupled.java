package interfaces;

public class TightlyCoupled {
	public static void main(String[] args) {
		
		Subject s = new Subject();
		s.startReading();
	}

}

//Java program to illustrate yourInput
//tight coupling concept 
class Subject { 
 Topic t = new Topic(); 
 public void startReading() 
 { 
     t.understand(); 
 } 
} 
class Topic { 
 public void understand() 
 { 
     System.out.println("Tight coupling concept"); 
 } 
} 
