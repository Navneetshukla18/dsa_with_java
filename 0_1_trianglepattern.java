public class 0_1_trianglepattern {
    public static void triPattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.pritn("0");
                }
            }
        }
    }
    public static void main(String args[]){
        triPattern(5);

    }
}
