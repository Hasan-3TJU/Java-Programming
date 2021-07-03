
public class GetCharsMethod {

 
    public static void main(String[] args) {
        String s=new String("Allah is the Almighty, Allah creates us");
        char[] ch=new char[16];
        try{
            s.getChars(23, 39, ch, 0);
            System.out.println(ch);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
