
public class IndexOfMethod {

  
    public static void main(String[] args) {
       String s=new String("Human is Mortal :)");
       int index1=s.indexOf("is");
       System.out.println(index1);
       
       int index2=s.indexOf("Mortal");
        System.out.println(index2);
        
       int index3=s.indexOf("is", 5);
        System.out.println(index3);
        
       int index4=s.indexOf("H");
        System.out.println(index4);
        
       int index5=s.indexOf("Mortal");
        System.out.println("The index of Substring "+index5);
    }
    
}
