import java.util.Scanner;
class Circle
{
    private double radius;
    private String color;

    Circle()
    {
        radius = 1.0;
        color = "red";
    }
    Circle(double r, String c)
    {
        radius = r;
        color = c;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return 3.14 * radius * radius;
    }

}
public class CircleDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter color: ");
        String c = sc.next();

        Circle c1 = new Circle(r, c);

        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());

        Circle c2 = new Circle();
        System.out.println("Default radius: " + c2.getRadius());
        System.out.println("Default area: " + c2.getArea());

    }
}