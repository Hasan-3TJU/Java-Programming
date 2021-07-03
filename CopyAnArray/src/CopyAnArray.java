
public class CopyAnArray {
    
    public static void main(String[] args) {
        char[] cfrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
        
        char[] cto = new char[7];
        System.arraycopy(cfrom, 2, cto, 0, 7);
        System.out.println(String.valueOf(cto));
        
        char[] cfrom1 = {'U', 'N', 'I', 'V', 'A', 'R', 'S', 'I', 'T', 'Y'};
        char[] cto1 = new char[7];
        System.arraycopy(cfrom1, 3, cto1, 0, 7);
        System.out.println(String.valueOf(cto1));
    }
    
}
