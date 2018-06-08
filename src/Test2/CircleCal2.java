package Test2;

import java.util.Scanner;

public class CircleCal2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius:");
        double radius = input.nextDouble();
        Circle2 circle = new Circle2(radius);
        circle.showArea();
        circle.showPerimeter();

    }

}
