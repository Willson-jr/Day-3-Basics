package Array;

public class Task6 {
    //plusTwoArrays([-4, 4], [8, 2]) → [-4, 4, 8, 2]
    //plusTwoArrays([9, 1], [3, 10]) → [9, 1, 3, 10]
    public static void main(String[] args) {
        int[] array1 = {-4, 4, 8, 2};
        int[] array2 = {9, 1, 3, 10};
        int[] newArray = plusTwo(array1, array2);
        //printSum1(newArray);
        int[] newArray2 = plusTwo2(array1,array2);
        for (int i = 0; i < newArray2.length; i++) {
            System.out.print(newArray2[i]+" ");
        }

    }

//    static void int[] printSum1(int[] array1) {
//        int[] newArray = new int[array1.length];
//        for (int i = 0; i < newArray.length ; i++) {
//            System.out.println(array1[i]);
//        }
//    }

    static int[] plusTwo(int[] array1, int[] array2) {
        int[] sum = new int[4];
        sum[0] = array1[0];
        sum[1] = array1[1];
        sum[2] = array2[0];
        sum[3] = array2[1];
        return sum;
    }

    static int[] plusTwo2(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int i = array1.length; i < newArray.length; i++) {
            newArray[i] = array2[j++];
        }
        return newArray;
    }
}
