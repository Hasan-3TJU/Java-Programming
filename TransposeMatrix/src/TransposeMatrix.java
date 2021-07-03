
public class TransposeMatrix {

    
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int t[][]=new int[3][3];
        
        System.out.println("Print Original Matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                t[i][j]=a[j][i];
            }
        }
        
        System.out.println("Print Transpose Matrix");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(t[i][j]+" ");
            }
             System.out.println();
        }
    
    }
    
}
