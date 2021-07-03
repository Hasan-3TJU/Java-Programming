
public class GetBytesmethod {

  
    public static void main(String[] args) {
        String s1="How Are You";
        byte[] b=s1.getBytes();
        
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        
        //get string back
        String s2=new String(b);
        System.out.println(s2);
    }
    
}
