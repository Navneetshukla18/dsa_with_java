import java.util.*;
public class func_over_para {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float c,float d){
        return c+d;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = sc.nextInt();
        float d = sc.nextInt();
        System.out.println(sum(a,b));
        System.out.println(sum(c,d));
    }
    
}
