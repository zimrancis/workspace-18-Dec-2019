package gc;

public class TestGarbage1{  
    public void finalize(){System.out.println("object is garbage collected");}  
    public static void main(String args[]){  
		/* TestGarbage1 s2= */new TestGarbage1();  
		/* s2=null; */  
     System.gc();  
    }  
   }  