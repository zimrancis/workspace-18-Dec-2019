package interfaces;

interface A
{
   public void aaa();
}
interface B
{
   public void aaa();
}
class Central implements A,B
{
   public void aaa()
   {
        //Any Code here
	   System.out.println("from Imlementation of A & B");
   }
   public static void main(String args[])
   {
        //Statements
	   B c = new Central();
	   c.aaa();
    }
}