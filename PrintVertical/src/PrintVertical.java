
import java.util.Scanner;



public class PrintVertical {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char c = 0;
        for(int i=0;i<s1.length();i++){
           c=s1.charAt(i);
           System.out.println(c);
        }
        
    }
    
}
