package Array;

public class Task8 {
    public static void main(String[] args) {
        //max([2,3,5,1,20,25]) = 25
        int[] array = {2, 3, 5, 1, 20, 25};
        System.out.println(max(array));
    }

    static int max(int[] array1) {
        int maximum = array1[0];
//        for (int i : array1){
//            if (i > maximum){
//                maximum = i;
//            }
//        }
        for (int i = 0; i < array1.length; i++) {
            if (maximum < array1[i]) {
                maximum = array1[i];
            }
        }
        return maximum;
    }
}
