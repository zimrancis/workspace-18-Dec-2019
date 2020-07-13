package interfaces;


//Java program to illustrate 
//loose coupling concept 
class Volume  
{ 
  public static void main(String args[])  
  { 
      Box b = new Box(5,5,5); 
      System.out.println(b.getVolume()); 
  } 
} 
final class Box  
{ 
  private int volume1;
  private int volume2; 
  public Box(int length, int width, int height)  
  { 
      this.volume1 = length * width * height; 
      this.volume2 = length * height- width ;
  } 
  public int getVolume()  
  {  
      return (volume1-volume2);  
        
  } 
} 
/*
 * Explanation : 
 * In the above program, there is no dependency between 
 * both the classes. If we change anything in the Box 
 * classes then we don't have to change anything in Volume class.
 *  
 * */
