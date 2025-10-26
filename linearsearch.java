public class linearsearch {
    public static int searching(int marks[],int key){
        for(int i=0; i<marks.length;i++){
            if (marks[i]==key){
                return i;
            }
           
        }
        return -1;

    }
public static void main(String args[]){
    int marks[] = {56,45,67,35,58};
    int key = 10;
    
    int index = searching(marks,key);
    if(index == -1){
        System.out.print("the key is not found ");
    }else{
        System.out.println("The key is at index "+index);
    }
    
}    
    
}
