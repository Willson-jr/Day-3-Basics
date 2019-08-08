package Array;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLast(new int[] {1,2,3}));

    }


    static int sumFirstAndLast(int[] array) {
        int sum = array[0] + array[array.length-1];
        return sum;
    }
}
