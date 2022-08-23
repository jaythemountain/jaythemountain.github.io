package drillexercises;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class DrillExcercises4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//  1.

//        int hourA = scan.nextInt(); // recommended
//        int hourB = scan.nextInt(); // no recommended
//        int hourH = scan.nextInt(); // hours per day that Ann sleeps
//        if (hourH < hourA){
//            System.out.println("Deficiency");
//        } else if (hourH >= hourA && hourH <= hourB) {
//            System.out.println("Normal");
//        } else {
//            System.out.println("Excess");
//        }
//  2.
//        double score1, score2, score3, average, ans;
//        NumberFormat formatter = new DecimalFormat("##.##");
//        System.out.println("Assign 1 score:");
//        score1 = scan.nextInt();;
//        System.out.println("Assign 2 score:");
//        score2 = scan.nextInt();
//        System.out.println("Assign 3 score:");
//        score3 = scan.nextInt();
//
//        average = (double) ((score1+score2+score3)/3);
//        ans = average;
//        System.out.println("Your average score is "+ formatter.format(ans));

//  3.
//        System.out.println("Enter a 3-digit integer");
//        int digit, first, second, third;
//        digit = scan.nextInt();
//
//        first = digit / 100;
//        second = (digit / 10) % 10;
//        third = digit % 10;
//
//        if(first+second >= third){
//            System.out.println("The number is true");
//        }
//        else{
//            System.out.println("The number is false");
//        }

//  4.

        class Box {
            private static int Width,Height,Depth;
            private static String Builder;
            public  Box(int W,int H,int D)
            {
                Width=24;
                Height=25;
                Depth=63;
                Builder="null";
            }
            public  Box(int W,int H,int D,String B)
            {
                Width=24;
                Height=25;
                Depth=63;
                Builder=B;
            }
            public String printMe()
            {

                String Output=""+"\nBox Built"+"\n\tWidth: "+Width+"\n\tHeight: "+Height+"\n\tDepth: "+Depth+"\n\tBuilt by\n"+Builder;
                return Output;
            }


        }

    }
}
