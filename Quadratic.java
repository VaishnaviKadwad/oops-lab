import java.util.Scanner;

class Quadratic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        if(a == 0)
        {
            System.out.println("Not a quadratic equation");
        }
        else
        {
            double d = b * b;

            System.out.println("Discriminant = " + d);

            if(d > 0)
            {
                System.out.println("Roots are real and distinct");

                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Root 1 = " + r1);
                System.out.println("Root 2 = " + r2);
            }
            else if(d == 0)
            {
                System.out.println("Roots are real and equal");

                double r = -b / (2 * a);

                System.out.println("Root = " + r);
            }
            else
            {
                System.out.println("Roots are imaginary");
            }
        }
    }
}