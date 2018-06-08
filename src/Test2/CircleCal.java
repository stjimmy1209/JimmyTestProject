package Test2;

public class CircleCal {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.inputRadius();
        c1.getArea();
        c1.getPerimeter();

        System.out.println("The perimeter of this circle is: " + c1.getPerimeter());
        System.out.println("The area of this circle is: " + c1.getArea());

    }
}
