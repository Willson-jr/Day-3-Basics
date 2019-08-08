package Array;

public class Task132 {
    public static void main(String[] args) {
        String[] array = {"fuck", "shite", "fagot", "cunt", "idiot"};
        for (String word : getFiveLetterWords(array)) {
            System.out.println(word);
        }
    }

    static boolean isFive(String word) {
        if (word.length() != 5) {
            return false;
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isLetter(word.charAt(i)))
                    return false;
            }
            return true;
        }
    }

    static String[] getFiveLetterWords(String[] array) {
        int length =0;
        boolean[] indexes = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] !=null) {
                if (isFive(array[i])) {
                    indexes[i] = true;
                    length++;
                } else {
                    indexes[i] = false;
                }
            }
        }
        String[] words = new String[length];
        int index =0;
        for (int i = 0; i < array.length ; i++) {
            if (indexes[i]){
                words[index++] = array[i];
            }
        } return words;
    }
}
