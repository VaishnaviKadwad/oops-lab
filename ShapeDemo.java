import java.util.Scanner;
class Shape
{
    void draw()
    {
        System.out.println("Drawing shape");
    }
    void erase()
    {
        System.out.println("Erasing shape");
    }
}
class Circle extends Shape
{
    double radius;
    Circle(double r)
    {
        radius = r;
    }
    void draw()
    {
        System.out.println("Drawing circle "+ "Radius: " + radius);
    }
    void erase()
    {
        System.out.println("Erasing circle");
    }
}
class Triangle extends Shape
{
    double base, height;
    Triangle(double b, double h)
    {
        base = b;
        height = h;
    }
    void draw()
    {
        System.out.println("Drawing triangle "+ "Base: " + base + " Height: " + height);
    }
    void erase()
    {
        System.out.println("Erasing triangle");
    }
}
class Square extends Shape
{
    double side;
    Square(double s)
    {
        side = s;
    }
    void draw()
    {
        System.out.println("Drawing square "+ "Side: " + side);
    }
    void erase()
    {
        System.out.println("Erasing square");
    }
}
class ShapeDemo
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.draw();
        c.erase();
        System.out.print("Enter base and height of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Triangle t = new Triangle(b, h);
        t.draw();   
        t.erase();
        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();
        Square sq = new Square(s);
        sq.draw();
        sq.erase();
    }
}