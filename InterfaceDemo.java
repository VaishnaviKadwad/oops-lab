import java.util.Scanner;

interface First
{
    void method1();
    void method2();
}

interface Second
{
    void method3();
    void method4();
}

interface Third
{
    void method5();
    void method6();
}

interface Fourth extends First, Second, Third
{
    void method7();
}

class Parent
{
    void parentDisplay()
    {
        System.out.println("This is concrete parent class");
    }
}

class Child extends Parent implements Fourth
{
    public void method1()
    {
        System.out.println("Method 1 of First interface");
    }

    public void method2()
    {
        System.out.println("Method 2 of First interface");
    }

    public void method3()
    {
        System.out.println("Method 1 of Second interface");
    }

    public void method4()
    {
        System.out.println("Method 2 of Second interface");
    }

    public void method5()
    {
        System.out.println("Method 1 of Third interface");
    }

    public void method6()
    {
        System.out.println("Method 2 of Third interface");
    }

    public void method7()
    {
        System.out.println("Method of Fourth interface");
    }
}

class InterfaceDemo
{
    static void display1(First obj)
    {
        obj.method1();
        obj.method2();
    }

    static void display2(Second obj)
    {
        obj.method3();
        obj.method4();
    }

    static void display3(Third obj)
    {
        obj.method5();
        obj.method6();
    }

    static void display4(Fourth obj)
    {
        obj.method7();
    }

    public static void main(String args[])
    {
        Child obj = new Child();

        obj.parentDisplay();

        System.out.println("\nPassing object to First interface:");
        display1(obj);

        System.out.println("\nPassing object to Second interface:");
        display2(obj);

        System.out.println("\nPassing object to Third interface:");
        display3(obj);

        System.out.println("\nPassing object to Fourth interface:");
        display4(obj);
    }
}