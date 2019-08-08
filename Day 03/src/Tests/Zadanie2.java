package Tests;

public class Zadanie2 {
//    public static void main(String[] args) {
//        long currentMillisecond = System.currentTimeMillis();
//        Zadanie2 codingBat = new Zadanie2();
//        codingBat.stringTimes("alshdf;lahsfjhas;fhakjshf", 1_000);
//        System.out.println(System.currentTimeMillis() - currentMillisecond);
//        currentMillisecond = System.currentTimeMillis();
//        codingBat.stringTimes2(new StringBuilder("alshdf;lahsfjhas;fhakjshf"), 1000);
//        System.out.println(System.currentTimeMillis() - currentMillisecond);
//    }

    public String stringTimes2(StringBuilder stringBuilder, int n) {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            result.append(stringBuilder);
        }
        return result.toString();
    }


    public String stringTimes(String str, int n) {
        String word = "";
        for (int i = 0; i < n; i++) {
            word = word + str;
        }
        return word;
    }


    public String frontTimes(String str, int n) {
        StringBuilder result = new StringBuilder("");
        if (str.length()>=3) {
            for (int i = 0; i<n ; i++) {
                result.append(str.substring(0,3));
            }
        } else {
            for (int i= 0; i<n ; i++){
                result.append(str);
            }
        }
        return result.toString();
    }

    static void swap(int a, int b){
        int c = a;
        b = a;
        a = c;

    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a, b);
        System.out.println(a+" "+b);
    }
}