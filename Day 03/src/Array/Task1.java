package Array;

public class Task1 {
    //first([1,2,3,4]) =  1first(4,9,12,1]) = 4
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4};

        System.out.println(first(testArray));
        System.out.println(last(testArray));
        System.out.println(sum(testArray));
        System.out.println(sumFirstAndLast(new int[] {1,2,3}));

    }
    //Task1
    static int first(int[] array) {
        return array[0];
    }
    //Task2
    static int last(int[] array) {
        return array[array.length-1];
    }
    //Task3 - 1
    static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    //Task3 - 2
    static void word(String str){
        System.out.println(str + "8");
    }
    //Task4
    static int sumFirstAndLast(int[] array) {
        int sum = array[0] + array[array.length-1];
        return sum;
    }
    //Task5
    static int middle(int[] array){
        if (array.length%2 == 0){
            return array[array.length/2-1];
        } else {
            return array[array.length/2];
        }


    }

}
