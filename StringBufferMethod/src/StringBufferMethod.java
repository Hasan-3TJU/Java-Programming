
public class StringBufferMethod {

  
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        
        //String Buffer Append Method
        sb.append(" Java");
        System.out.println(sb);//Hello Java
        
        //String Buffer Insert Method
        sb.insert(0, "Hey ");
        System.out.println(sb);//Hey Hello Java
        
        //String Buffer replace Methos
        sb.replace(1,4,"ow are you ");
        System.out.println(sb);//How are you Hello Java
        
        //String Buffer Delete Method
        sb.delete(12,18);
        System.out.println(sb);//How are you Java
        
        //String Buffer Reverse Method
        System.out.println(sb.reverse());//avaJ uoy era woH
        
        //String Buffer Capacity
        
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());//16
        
        sb1.append("man is Mortal");
        System.out.println(sb1.capacity());//16
        
        sb1.append(". Human needs Oxyzen");
        System.out.println(sb1.capacity());//34
        
        sb1.append(". Human is the best creature");
        System.out.println(sb1.capacity());//70
        
        //String Buffer Ensure Capacity
        sb.ensureCapacity(40);
        System.out.println(sb.capacity());
        
        
        
    }
    
}
