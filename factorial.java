import java.util.*;
public class factorial {
    public static int factorial1(int x){
        int fact1=1;
        for (int i=1;i<=x;i++){
            fact1 = fact1*i;
        }    
        return fact1;       
    }
   
   
   
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want the factorial of :");
        int n = sc.nextInt();
      // int fact=factorial1(n);
        System.out.println("The factorial is :" +factorial1(n));
    }
    
}
