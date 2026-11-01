import java.util.Scanner;

class Car
{
    double fuelLevel;

    Car(double fuelLevel)
    {
        this.fuelLevel = fuelLevel;
    }

    void display()
    {
        System.out.println("Fuel level: " + fuelLevel);
    }
}

class FuelDemo
{
    static void estimateFuel(double fuel, double used)
    {
        fuel = fuel - used;

        System.out.println("Fuel after estimated trip: " + fuel);
    }

    static void completeTrip(Car c, double used)
    {
        c.fuelLevel = c.fuelLevel - used;

        System.out.println("Fuel after completed trip: " + c.fuelLevel);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial fuel level: ");
        double fuel = sc.nextDouble();

        System.out.print("Enter estimated fuel consumption: ");
        double used = sc.nextDouble();

        System.out.println("\nBefore estimation: " + fuel);

        estimateFuel(fuel, used);

        System.out.println("Original fuel level after estimation: " + fuel);

        Car c = new Car(fuel);

        System.out.print("\nEnter actual fuel consumed: ");
        double actual = sc.nextDouble();

        System.out.println("Before completing trip:");
        c.display();

        completeTrip(c, actual);

        System.out.println("After completing trip:");
        c.display();
    }
}