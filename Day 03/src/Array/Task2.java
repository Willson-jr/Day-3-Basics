package Array;

public class Task2 {

    //first([1,2,3,4]) =  1first(4,9,12,1]) = 4
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4};
        int var = last(testArray);
        System.out.println(var);

    }

    static int last(int[] array) {
        return array[array.length-1];
    }
}
