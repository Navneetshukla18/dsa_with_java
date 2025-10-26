public class numberPyramid {
    public static void numbers_pyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }//another logic(mine)
           /*  for (int j=1; j<=(2*i)-1; j++){
                if ((j%2)==0){
                    System.out.print(" ");
                }else{
                    System.out.print(i);
                }
                */
            //mam's logic
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }

            
            System.out.println();
        }
        }
        
    
    public static void main(String args[]){
        numbers_pyramid(5);

    }
}
