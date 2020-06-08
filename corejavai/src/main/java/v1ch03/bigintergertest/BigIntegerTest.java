package v1ch03.bigintergertest;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();
        BigInteger lotteryodds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            lotteryodds = lotteryodds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }
        System.out.println("your odds are in " + lotteryodds + ". Good luck!");
    }
}
