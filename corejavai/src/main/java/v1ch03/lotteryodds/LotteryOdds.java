package v1ch03.lotteryodds;

import java.util.Scanner;

public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();
        int lotteryodds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryodds = lotteryodds * (n - i + 1) / i;
            System.out.println(lotteryodds);
        }
        System.out.println("your odds are in " + lotteryodds + ". Good luck!");
    }
}
