
package stringimplementation;

import java.util.Scanner;

public class StringImplementation {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        String s1=s.next();//Amin
        String s2=s.next();//AMIN
        String s3=s.next();//Amin
        String s4=new String("Amin");
        
        //String Compares by equals method
        
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
       
        //String compares by ignoring case
        String s5=s.next();//Amin
        String s6=s.next();//AMIN
        System.out.println(s5.equalsIgnoreCase(s6));
        
        //String compares by compareTo method
        
        String s7="Hamid";
        String s8="Najmul";
        String s9="Nabid";
        
        System.out.println(s7.compareTo(s8));//-6
        System.out.println(s7.compareTo(s9));//-6
        System.out.println(s9.compareTo(s7));//6
        
        //String compates by == method
        String s10="Sachin";
        String s11="Sachin";
        String s12=new String("Sachin");
        System.out.println(s10==s11);//true
        System.out.println(s10==s12);//false bcz new instance is created
    }
    
}
