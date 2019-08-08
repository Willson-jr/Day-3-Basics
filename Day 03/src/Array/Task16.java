package Array;

public class Task16 {
    public static void main(String[] args) {
        int[] array1 = {-4, 42, 8, 25, 2, 37, 23, 7, 2, 123};
        String[] array2 = twoSize(array1);
        for (String i: array2) {
            System.out.println(i);
        }

    }

    public static String[] twoSize (int[] array) {
        String[] twoSize = new String[array.length];
        for (int i = 0; i < array.length ; i++) {
            twoSize[i]= String.valueOf(array[i]);
        }
        String[] newSize = new String[twoSize.length];
        for (int i = 0; i <twoSize.length ; i++) {
            if (twoSize[i].length()== 2){
                newSize[i] = twoSize[i];
            }
        }
        return newSize;
    }
}
