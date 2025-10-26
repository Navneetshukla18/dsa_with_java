public class bintodec {
    public static void binarytodec(int num){
        int mynum=num;
        int pow=0;
        int lastd=0;
        int decnum=1;
        while(num>0){
            lastd=num%10;
            decnum=decnum+lastd*(int)Math.pow(2,pow);
            pow++;
            num=num/10;
            
        }
        System.out.println("decimal of "+ mynum + " is : " + decnum );

    }
    public static void main(String[] args) {
       binarytodec(101);
    }
    
}
