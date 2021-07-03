/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringimplement;

import java.util.Scanner;
public class StringImplement {

    
    public static void main(String[] args) {
       //startsWith() & endsWith() method
       
       Scanner s=new Scanner(System.in);
       String s1=s.next();
        System.out.println(s1.startsWith("Moh"));
        System.out.println(s1.endsWith("n"));
    }
    
}
