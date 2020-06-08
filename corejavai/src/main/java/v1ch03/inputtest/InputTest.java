package v1ch03.inputtest;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] ags) {
        Scanner in = new Scanner(System.in);
        System.out.print("what is your name?");
        String name = in.next();
        System.out.print("How old are you?");
        int age = in.nextInt();
        System.out.println("Hello," + name + ". Next year,you'll be " + (age + 1));
    }
}
