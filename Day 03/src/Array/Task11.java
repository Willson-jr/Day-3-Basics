package Array;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] array = {4, 1, 9, 15, 40, 2, 14, 12};
        int[] newArray = mySort(array);

        for (int value : newArray) {
            System.out.print(value + " ");
        }

    }

    static int[] mySort(int[] array){
        Arrays.sort(array);
        return array;
    }
}
