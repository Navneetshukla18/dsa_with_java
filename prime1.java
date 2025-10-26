import java.util.*;
public class prime1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        int count = 0;
        


        for(int i=2;i<Math.sqrt(num);i++){
            if((num%i)==0){
              count++;
            
            }  
         } 
              
        if( count>=1){
            System.out.println("The number is not prime. ");
           }
        else{
            System.out.println("The number is prime.  ");

        }   
     }

    }
    

