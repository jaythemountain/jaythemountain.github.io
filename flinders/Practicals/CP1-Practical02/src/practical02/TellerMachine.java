package practical02;

import java.util.Scanner;

public class TellerMachine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // declare any variables here
        int num;
        int twenty, five, one;
        // Output the values here.
        System.out.print("Enter an amount of cents in the range 0 to 100: ");
        num = scan.nextInt();
        // Output goes here
        twenty = num / 20;
        num = num % 20;
        five = num / 5;
        num = num % 5;
        one = num / 1;
        num = num % 1;

        System.out.println("Dispensing...");
        System.out.println(twenty + " 20c coin(s)");
        System.out.println(five + " 5c coin(s)");
        System.out.println(one + " 1c coin(s)");

    }
}