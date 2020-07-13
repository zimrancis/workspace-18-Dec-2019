package common;
import java.text.DecimalFormat;

public class IntToString {

	public static void main(String[] args) {
		
		int d = 1234; 
	    Integer obj = new Integer(d); 
	    String string0 = obj.toString();
	    System.out.println("String string0 = " + string0);

	    String string1 = new Integer(d).toString(); 
	    System.out.println("String string1 = " + string1);
	    
	    String string2 = new Integer(1234).toString();
	    System.out.println("String string2 = " + string2);
		
	    
	    int e = 12345; 
	    DecimalFormat df = new DecimalFormat("#"); 
	    String string3 = df.format(e); 
	    System.out.println("String string3 = " + string3);
	    
	    DecimalFormat df2 = new DecimalFormat("#,###"); 
	    String string4 = df2.format(e);
	    System.out.println("String string4 = " + string4);
	    
	    int f = 1234; 
	    StringBuffer sb = new StringBuffer(); 
	    sb.append(f); 
	    String string5 = sb.toString(); 
	    System.out.println("String string5 = " + string5); 
	    
	    String string6 = new StringBuffer().append(1234).toString(); 
	    System.out.println("String string6 = " + string6);
	    
	    int g = 1234; 
	    StringBuilder sb1 = new StringBuilder(); 
	    sb.append(g); 
	    String string7 = sb1.toString(); 
	    System.out.println("String string7 = " + string7);
	    
	    String str11 = new StringBuilder().append(1234).toString(); 
	    System.out.println("String str7 = " + str11);
	    
	    int h = 255; 
	    String binaryString = Integer.toBinaryString(h); 
	    System.out.println(binaryString); 
	    
	    int i = 255; 
	    String octalString = Integer.toOctalString(i); 
	    System.out.println(octalString); 
	    
	    int j = 255; 
	    String hexString = Integer.toHexString(j); 
	    System.out.println(hexString); 
	    
	    int k = 255; 
	    String customString = Integer.toString(k, 7); 
	    System.out.println(customString); 

	}

}
