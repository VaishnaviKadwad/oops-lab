import java.util.Scanner;
abstract class Shape
{
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Circle extends Shape
{
    double radius;
    Circle(double r)
    {
        radius = r;
    }
    void calculateArea()
    {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
    }
    void calculatePerimeter()
    {
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter of circle: " + perimeter);
    }
}
class Triangle extends Shape
{
    double a, b, c;
    double s;
    Triangle(double x, double y, double z)
    {
        a = x;
        b = y;
        c = z;
    }
    void calculateArea()
    {
        s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle: " + area);
    }
    void calculatePerimeter()
    {
        double perimeter = a + b + c;
        System.out.println("Perimeter of triangle: " + perimeter);
    }
}
public class AbstractDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r=sc.nextDouble();
        Circle c=new Circle(r);
        c.calculateArea();
        c.calculatePerimeter();

        System.out.print("Enter sides of triangle: ");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        Triangle t=new Triangle(x, y, z);
        t.calculateArea();
        t.calculatePerimeter();
    }
}
