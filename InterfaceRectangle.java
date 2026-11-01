import java.util.Scanner;
interface Resizable
{
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable
{
    int width, height;
    Rectangle(int w, int h)
    {
        width = w;
        height = h;
    }
    public void resizeWidth(int w)
    {
        width = w;
    }
    public void resizeHeight(int h)
    {
        height = h;
    }
    void display()
    {
        System.out.println("Width: " + width + " Height: " + height);
    }
}
public class InterfaceRectangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();
        System.out.print("Enter height of rectangle: ");
        int h = sc.nextInt();

        Rectangle r = new Rectangle(w, h);
        r.display();

        System.out.print("Enter new width of rectangle: ");
        int newWidth = sc.nextInt();
        r.resizeWidth(newWidth);
        
        System.out.print("Enter new height of rectangle: ");
        int newHeight = sc.nextInt();
        r.resizeHeight(newHeight);
        r.display();
    }
}