/*import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Display result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close();
    }
}*/
import java.util.*;
public class SumTwoNumbers {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number:");
    int num1 = sc.nextInt();
    System.out.println("enter the second number:");
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    System.out.println("the sum of " + num1 + " and " + num2 + " is : "  + sum);
}
}