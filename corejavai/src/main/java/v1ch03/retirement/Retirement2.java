package v1ch03.retirement;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much money will you contribute every year ?");
        double payment = in.nextDouble();
        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();
        double balance = 0;
        int year = 0;
        String input;
        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;
            System.out.print("After year " + year + ",your balance is " + balance);
            System.out.println("Ready to retire?(Y/N)");
            input = in.next();
        }
        while (input.equals("N"));
    }
}
