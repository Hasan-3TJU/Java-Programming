
public class ReturnArrayfromMethod {

    public static void main(String[] args) {
        Array ar=new Array(); 
        int a[]=ar.get();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}

class Array {

    int[] get() {
        return new int[]{5, 6, 7, 8, 9};
    }
}
