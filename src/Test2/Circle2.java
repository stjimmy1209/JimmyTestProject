package Test2;

public class Circle2 {
    private double radius;
    private double perimeter;
    private double area;

    public Circle2(){
    }
    public Circle2(double radius){
        this.setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if (radius <= 0){
            System.out.println("Radius must be greater than zero!");
            System.exit(0);
        }else {
            this.radius = radius;
        }

    }

    public double getPerimeter() {
        perimeter = radius * 2 * Math.PI;
        return perimeter;
    }

    public double getArea() {
        area = Math.pow(radius,2) * Math.PI;
        return area;
    }

    public void showPerimeter(){
        System.out.println("The perimeter of this circle is " + this.getPerimeter());
    }
    public void showArea(){
        System.out.println("The area of this circle is " + this.getArea());
    }
}
