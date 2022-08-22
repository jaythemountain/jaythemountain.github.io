package drillexercises;

import java.util.Scanner;

public class DrillExcercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//    Q4
//    Write code that reads in a 4-digit number and that outputs the product of the digits.
//    8664 = Enter a 4-digit integer
//      The product of all of the digits is 1152
//        System.out.println("Enter a 4-digit integer");
//        int digit = scan.nextInt();
//        int num1, num2, num3, num4;
//        num1 = digit / 1000;
//        num2 = (digit / 100) % 10;
//        num3 = (digit / 10) % 10;
//        num4 = digit % 10;
//
//        System.out.println("The product of all of the digits is "+ (num1*num2*num3*num4) );
//        ____________________________________________________________________________________________________________

//      Q3
//        System.out.println("Enter two integers:");
//        int digit = scan.nextInt();
//        int digit2 = scan.nextInt();
//
//        int a, b;
//        a = digit;
//        b = digit2;
//        if(a > b){
//            System.out.println(a + " - 101 = "+ (a-101) );
//        }else {
//            System.out.println(b + " + 101 = "+ (b+101) );
//        }
//  _________________________________________________________________________________________________________________
//        Q2
//        System.out.println("Enter two integers:");
//        int digit = scan.nextInt();
//        int digit2 = scan.nextInt();
//
//        int a, b;
//        a = digit;
//        b = digit2;
//        if(a < b){
//            System.out.println(a + " + 73 = "+ (a+73) );
//        }else {
//            System.out.println(b + " - 73 = "+ (b-73) );
//        }
//  _________________________________________________________________________________________________________________

//        Q1
        System.out.println("Enter a 5-digit integer:");
        String message;
        message = scan.nextLine();
        String num;
        int f;
        f = 5;
        num = ""+message.charAt(3);
        int n = Integer.parseInt(num);


        if(n > f){
            System.out.println("The number is true");
        }else{
            System.out.println("The number is false");
        }

        System.out.println("You entered " + message);
//        System.out.println("You entered " + n4);
        System.out.println("4th number is  " + num);

    }

}
