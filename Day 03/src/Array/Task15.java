package Array;

public class Task15 {
    public static void main(String[] args) {
        String[] array = {"FucK", "Shite", "faGGot", "CuNt", "idiot"};

        System.out.println(getTheLongest(array));
        }



    static int getTheLongest (String[] array){
        if (array.length == 0) {
            return -1;
        } else {
            int max = array[0].length();
            for (String value: array) {
                if (value.length()>max) {
                    max = value.length();
                }
            }return max;
        }
    }
}
