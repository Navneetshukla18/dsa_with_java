import java.util.*;
public class bincoeff {
    public static int factorial1 (int x){
        int fact1 = 1;
        for (int i=1; i<=x; i++){
            fact1 = fact1*i;
        }   return fact1;

    }           
 
    public static int binocoeff(int n,int r){
        int num1 = factorial1(n);
        int num2 = factorial1(r);
        int nmr = factorial1(n-r);
        int result = (num1/(num2*(nmr)));
        return result;


    }
    
    
   
   
   
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
      // int fact=factorial1(n);
      System.out.println("enter the value of r:");
      int r = sc.nextInt();
        System.out.println("The binomial coefficient is :"+binocoeff(n,r));
    }
    
}
