import java.util.Scanner;

interface CircleOps
{
    double calculateCircleArea();

    double calculateCirclePerimeter();
}

interface RectangleOps
{
    double calculateRectangleArea();

    double calculateRectanglePerimeter();
}

interface ShapeOps extends CircleOps, RectangleOps
{
    void displaySummary();
}

class ShapeBase
{
    double radius;
    double length, width;

    ShapeBase(double radius, double length, double width)
    {
        this.radius = radius;
        this.length = length;
        this.width = width;
    }
}

class ShapeCalculator extends ShapeBase implements ShapeOps
{
    ShapeCalculator(double radius, double length, double width)
    {
        super(radius, length, width);
    }

    public double calculateCircleArea()
    {
        return 3.14 * radius * radius;
    }

    public double calculateCirclePerimeter()
    {
        return 2 * 3.14 * radius;
    }

    public double calculateRectangleArea()
    {
        return length * width;
    }

    public double calculateRectanglePerimeter()
    {
        return 2 * (length + width);
    }

    public void displaySummary()
    {
        System.out.println("\n----- SHAPE SUMMARY -----");

        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + calculateCircleArea());
        System.out.println("Circle Perimeter: " + calculateCirclePerimeter());

        System.out.println("\nRectangle Length: " + length);
        System.out.println("Rectangle Width: " + width);
        System.out.println("Rectangle Area: " + calculateRectangleArea());
        System.out.println("Rectangle Perimeter: " + calculateRectanglePerimeter());
    }
}

class ShapesDemo
{
    static void circleDisplay(CircleOps obj)
    {
        System.out.println("\n----- CIRCLE DETAILS -----");

        System.out.println("Area: " + obj.calculateCircleArea());

        System.out.println("Perimeter: " + obj.calculateCirclePerimeter());
    }

    static void rectangleDisplay(RectangleOps obj)
    {
        System.out.println("\n----- RECTANGLE DETAILS -----");

        System.out.println("Area: " + obj.calculateRectangleArea());

        System.out.println("Perimeter: " + obj.calculateRectanglePerimeter());
    }

    static void shapeDisplay(ShapeOps obj)
    {
        obj.displaySummary();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter rectangle length: ");
        double l = sc.nextDouble();

        System.out.print("Enter rectangle width: ");
        double w = sc.nextDouble();

        if(r <= 0 || l <= 0 || w <= 0)
        {
            System.out.println("Invalid dimensions");
            return;
        }

        ShapeCalculator obj = new ShapeCalculator(r, l, w);

        circleDisplay(obj);

        rectangleDisplay(obj);

        shapeDisplay(obj);
    }
}