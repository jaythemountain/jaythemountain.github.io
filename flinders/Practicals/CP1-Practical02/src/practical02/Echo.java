package practical02;

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message;
        String message2;

        System.out.println("Enter a line:");
        message = scan.nextLine();
        System.out.println("Enter another line:");
        message2 = scan.nextLine();

        System.out.println("You entered: " + message2+", "+ message);
    }
}
