
package string.concatenation;

import java.util.Scanner;
public class StringConcatenation {

   
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      
      String s1=s.next();
      String s2=s.next();
      String s3=50+30+"Eggs"+80+80;
      
      System.out.println(s1+" "+s2);
      System.out.println(s3);
      
      System.out.println(s1.concat(" "+s2));
        
    }
    
}
