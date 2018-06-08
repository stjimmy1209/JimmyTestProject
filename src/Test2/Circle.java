package Test2;

import java.util.Scanner;

public class Circle {
    double radius;
    double perimeter;
    double area;

    public void inputRadius(){
        System.out.println("Please enter the radius:");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        input.close();
    };

    public double getPerimeter(){
        if(radius == 0){
            inputRadius();
        }
        double perimeter = radius * 2 * Math.PI;
        return perimeter;

    }

    public double getArea(){
        if(radius == 0){
            inputRadius();
        }
        double area = radius * radius * Math.PI;
        return area;
    }
}


