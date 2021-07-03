
public class IsEmptyMethod {

   
    public static void main(String[] args) {
        String s1="";
        String s2="Hello";
        
        if(s1.length()==0 || s1.isEmpty()){
            System.out.println("String S1 is Empty");
        }else
            System.out.println(s1);
        
        
        if(s2.length()==0 || s2.isEmpty()){
            System.out.println("String S2 is Empty");
        }else
            System.out.println(s2);
    
    }
    
}
