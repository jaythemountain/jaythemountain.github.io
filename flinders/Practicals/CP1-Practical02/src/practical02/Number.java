package practical02;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message;

        System.out.println("Enter a line:");
        message = scan.nextLine();

        System.out.println("You entered: " + message);

    }
}
