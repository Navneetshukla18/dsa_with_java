public class arrays_as_argument {
    public static void update(int marks[],int unchanged) {
        unchanged +=100;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        int unchanged=10;
        update(marks,unchanged);


       // System.out.println(unchanged);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}


