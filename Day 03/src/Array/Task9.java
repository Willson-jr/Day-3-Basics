package Array;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 1, 20, 25};
        int[] newArray = swap(array);
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.print(newArray[i]);
//        }
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }

    static int[] swap(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[j] = array[i];
            j++;
        }
//        for (int i = 0; i < array.length ; i++) {
//            newArray[i]=array[array.length-1-i];
//        }
        return newArray;
    }
}
