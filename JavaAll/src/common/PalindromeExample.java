package common;
import java.util.*;

class PalindromeExample{
 public static void main(String args[]){
  int remainder,sum=0,temp;
  int number=454;//It is the number variable to be checked for palindrome

  temp=number;
  while(number>0){ // 454; 45; 4;
   remainder=number%10;  //getting remainder 4; 5; 4;
   sum=(sum*10)+remainder; // 4; 45; 454
   number=number/10; // 45; 4; 0
  }
  if(temp==sum)
   System.out.println("palindrome number ");
  else
   System.out.println("not palindrome");


   String original, reverse = ""; // Objects of String class
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a string/number to check if it is a palindrome");
         original = in.nextLine();
         int length = original.length();
         for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
         if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
         else
         System.out.println("Entered string/number isn't a palindrome.");
}
}