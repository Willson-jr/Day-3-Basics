package Array;

public class Task14 {
    public static void main(String[] args) {
        String[] array = {"FucK", "Shite", "faGGot", "CuNt", "idiot"};
        String[] lowerAt= lower(array);
        for (String word: lowerAt
             ) {
            System.out.println(word);
        }

    }

     public static String[] lower(String[] array) {
        String[] newLower = new String[array.length];
        for (int i = 0; i <array.length; i++) {
            newLower[i]=array[i].toLowerCase();

        }
        return newLower;
    }
}
