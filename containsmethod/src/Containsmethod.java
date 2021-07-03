
public class Containsmethod {

    public static void main(String[] args) {
        String s1="What do you know about me";
        
        System.out.println(s1.contains("do you know"));
        System.out.println(s1.contains("Hi"));
        
        String s2="Java is a programming Language";
        
        if(s2.contains("Java")){
            System.out.println("Result is Found");
        }
        else{
            System.out.println("String doesn't found");
        }
    }
    
}
