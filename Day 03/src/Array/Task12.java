package Array;

public class Task12 {
    public static void main(String[] args) {
        //makeMiddle([1,2,3,4]) = [2, 3]
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] newArray = middle(array);
        for (int value : newArray) {
            System.out.print(value + " ");
        }

    }
    static int[] middle(int[] array){
        int[] mArray = {array[array.length/2-1],array[array.length/2]};
        return mArray;
    }
}
