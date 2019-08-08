package Array;

public class Task3 {
    public static void main(String[] args) {
        int[] testArray = {1, 2};
        int[] testArray2 = {4, 8};

        //System.out.println(sum(testArray));
        //System.out.println(sum(testArray2));
        System.out.println(sum(new int[]{1,5}));
    }

    static int sum(int[] array) {
        int sum = array[0] + array[1];
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
        return sum;
    }
}
