package Test1;

import java.util.Scanner;

public class SimCal {

    public static void main(String[] args)

    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the radius:");

        double r = input.nextDouble();
        double a = r * r * 3.14;

        System.out.printf("The area of the circle is:\t%.2f.", a);

    }

}
