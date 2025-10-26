public class numrev {
    public static void main(String args[]){
        int n = 10899;
        int lastdigit = 0;
        int rev = 0;

        while (n>0){
            lastdigit = (n%10);
            rev = (rev * 10)+ lastdigit;
            n = n/10;
        }
        System.out.println(rev);


    }
    
}
