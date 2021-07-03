
public class StringCharacterArray {


    public static void main(String[] args) {
        String s1="How are you";
        char[] ch=s1.toCharArray();
        
        int l=s1.length();
        
        for(int i=0;i<l;i++){
            System.out.println(ch[i]);
        }
    }
    
}
