import java.util.*;
public class floyd_triangle {
    public static void floydTriangle( int n){
        int num = 1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int n = sc.nextInt();
        floydTriangle(n);

    }
    
}
