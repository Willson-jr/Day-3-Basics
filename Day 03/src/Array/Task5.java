package Array;

public class Task5 {
    //middleElement(​([1, 2, 3])  =   2
    //middleElement(​([1, 5, 3, 4])  = 5

    public static void main(String[] args) {
        System.out.println(middle(new int[] {1, 2, 3,4,6,7,20}));
        System.out.println(middle(new int[] {1, 5, 3, 4,10,11,10}));
    }

//    static int middle(int[] array){
//        if (array.length%2 == 0){
//            return array[array.length/2-1];
//        } else {
//            return array[array.length/2];
//        }
// }
    static int middle(int[] array) {
        return array[(array.length-1)/2];
    }
}
