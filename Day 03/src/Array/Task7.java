package Array;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(sum(array));;
    }

    static int sum(int[] array) {
        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
        for (int value :array ) {
            System.out.println(value);
            sum = sum + value;
        }
        return sum;
    }

}
