package Tests;

import java.math.BigInteger;

public class Sum {
    static int sum(int n) {
//        int result = (n * (1 + n) / 2);
//        if (n%2==0){
//            return (n/2)*(n+1);
//        } else {
//            return(n+1)/2*n;
//        }
        long start2 = System.nanoTime();
        System.out.println(System.nanoTime() - start2);
        return n % 2 == 0 ? (n / 2) * (n + 1) : (n + 1) / 2 * n;

    }


    static int sum3(int n) {
        int score = 0;
        for (int i = 1; i <= n; i++) {
            score += i;
        }
        long start2 = System.nanoTime();
        System.out.println(System.nanoTime() - start2);
        return score;
    }

    static BigInteger sum4(int n) {
        if (n%2==0) {
            BigInteger nInteger = new BigInteger("" + n);
            BigInteger next = new BigInteger("" + (n+1));
            return nInteger.divide(new BigInteger(""+2)).multiply(next);
        } else {
            BigInteger nInteger = new BigInteger("" + n+1);
            BigInteger next = new BigInteger("" + (n));
            return nInteger.divide(new BigInteger("2")).multiply(next);
        }

    }

    public static void main(String[] args) {

        System.out.println(sum3(100));
        System.out.println(sum(100));
        System.out.println(sum4(100));
    }

}
