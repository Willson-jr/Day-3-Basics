package Array;

public class Task13 {
    public static void main(String[] args) {
//        makeMiddle([1,2,3,4]) = [2, 3]
//        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
//        int[] newArray = middle(array);
//        for (int value : newArray) {
//            System.out.print(value + " ");
        String[] array = {"fuck", "shite", "fagot", "cunt", "idiot"};
        String[] newArray = five(array);
        for (String value : newArray) {
            System.out.print(value + " ");
        }

    }

    public static String[] five(String[] array) {
        String[] newArray2 = new String[array.length];

        int j=0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i].length() == 5) {
                newArray2[j] = array[i];
                j++;
            }
        }
        String[] newArray3 = new String[newArray2.length];
        for (int i = 0; i < newArray2.length - 1; i++) {
            newArray3[i] = newArray2[i];
        }
        return newArray3;
    }


}
