public class DefaultValues
{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    void display()
    {
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Character: " + (int)c);
        System.out.println("Boolean: " + bool);
    }

    public static void main(String args[])
    {
        DefaultValues obj = new DefaultValues();
        obj.display();
    }
}