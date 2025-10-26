import java.util.*;
public class product {
    public static int product1(int num1,int num2){
        int product2 = num1*num2;
        return product2;
    }
    
    
    
    
    
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = product1(a,b);
        System.out.println("the product is :"  + prod);
    }
    
}
