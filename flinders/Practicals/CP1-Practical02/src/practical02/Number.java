package practical02;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message;
        String message2;
        String total;

        System.out.println("Enter a line:");
        message = scan.nextLine();

        System.out.println("Enter another line:");
        message2 = scan.nextLine();
        total = message+message2;
        int t = Integer.parseInt(total);
        System.out.println("Number = " + message + message2);
//        System.out.println("The complete number is " message+message2 + " and adding 1 gives" + total+1 );
        System.out.println("The complete nmber is " + total + " and adding 1 gives " + (t+1) );
    }
}
