package practical02;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        // declare variables here
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int n = scan.nextInt();

        int val1, val2, total = 0;
//        int val1 = 0;
//        val1 = n;
//        int val2 = val1+1;
//        total = val1+val2;
        val1 = n;
        val2 = val1+1;
        total = val1+val2;

//        System.out.println("val1 is " + val1);
//        System.out.println("val2 is " + val2);
//        System.out.println("Total is " + total);
        System.out.println(val1 +", " + val2 + ", " + total);
    }

}
