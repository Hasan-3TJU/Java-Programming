
public class StringFormat {

    
    public static void main(String[] args) {
        float a=(float) 10.1234;
        String s1=String.format("%.2f",a);
        System.out.println(s1+" is a floating number");
        
        int b=758;
        String s2=String.format("%x",b);
        System.out.println(s2+" is a hexa value of b=758");
                
        
    }
    
}
