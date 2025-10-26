public class rectangle_pattern {
    public static void hollow_rect(int rows,int cols ){
        //outer loop
        for (int i=1;i<=rows;i++){
            //inner loop
            for (int j=1;j<=cols;j++){
                if(i==1||i==rows||j==1||j==cols){
                    System.out.print("*");
                }else {
                    System.out.print(" ");

                }
            }System.out.println();

        }
    }



    public static void main(String args[]){
        hollow_rect(5,7);

    }
    
}
