import java.util.*;
public class largest {
    public static void get_largest(int numbers[]){
        int largest = Integer.MIN_VALUE;   //-INFINITY(used for assigning lowest possible value)
        int smallest = Integer.MAX_VALUE;  //+INFINITY(used for assigning highest possible value)
        for(int i=0; i<numbers.length;i++){
            if (largest<numbers[i]){
                largest = numbers[i];
            }
            if (smallest>numbers[i]){
                smallest = numbers[i];

            }
        }System.out.println("The smallest value is: "+smallest);
         System.out.println("The largest value is: "+largest);
        //return largest;        
       
    }


    public static void main(String args[]){
        int numbers [] = {1,-5,6,3,6,8,9,23,78,9};
        get_largest(numbers);


      //  System.out.println("The largest value is : " + get_largest(numbers));


    }
    
}
