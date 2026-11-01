import java.util.Scanner;

class Car
{
    int speed;
    double regularPrice;
    String color;

    Car(int speed, double regularPrice, String color)
    {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice()
    {
        return regularPrice;
    }
}

class Truck extends Car
{
    int weight;

    Truck(int speed, double price, String color, int weight)
    {
        super(speed, price, color);
        this.weight = weight;
    }

    double getSalePrice()
    {
        if(weight > 2000)
        {
            return regularPrice - (regularPrice * 0.10);
        }
        else
        {
            return regularPrice - (regularPrice * 0.20);
        }
    }
}

class Ford extends Car
{
    int year;
    int manufacturerDiscount;

    Ford(int speed, double price, String color,
         int year, int discount)
    {
        super(speed, price, color);

        this.year = year;
        manufacturerDiscount = discount;
    }

    double getSalePrice()
    {
        return regularPrice - manufacturerDiscount;
    }
}

class Sedan extends Car
{
    int length;

    Sedan(int speed, double price, String color, int length)
    {
        super(speed, price, color);
        this.length = length;
    }

    double getSalePrice()
    {
        if(length > 20)
        {
            return regularPrice - (regularPrice * 0.05);
        }
        else
        {
            return regularPrice - (regularPrice * 0.10);
        }
    }
}

class MyOwnAutoShop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sedan details:");

        System.out.print("Enter speed: ");
        int speed = sc.nextInt();

        System.out.print("Enter regular price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter color: ");
        String color = sc.nextLine();

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        Sedan s = new Sedan(speed, price, color, length);

        System.out.println("\nEnter Ford details:");

        System.out.print("Enter speed: ");
        speed = sc.nextInt();

        System.out.print("Enter regular price: ");
        price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter color: ");
        color = sc.nextLine();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter manufacturer discount: ");
        int discount = sc.nextInt();

        Ford f = new Ford(speed, price, color, year, discount);

        System.out.println("\nEnter Truck details:");

        System.out.print("Enter speed: ");
        speed = sc.nextInt();

        System.out.print("Enter regular price: ");
        price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter color: ");
        color = sc.nextLine();

        System.out.print("Enter weight: ");
        int weight = sc.nextInt();

        Truck t = new Truck(speed, price, color, weight);

        System.out.println("\nEnter Car details:");

        System.out.print("Enter speed: ");
        speed = sc.nextInt();

        System.out.print("Enter regular price: ");
        price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter color: ");
        color = sc.nextLine();

        Car c = new Car(speed, price, color);

        System.out.println("\n----- SALE PRICES -----");

        System.out.println("Sedan Sale Price: " + s.getSalePrice());

        System.out.println("Ford Sale Price: " + f.getSalePrice());

        System.out.println("Truck Sale Price: " + t.getSalePrice());

        System.out.println("Car Sale Price: " + c.getSalePrice());
    }
}