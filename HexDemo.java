import java.util.Scanner;

class Num
{
    int n;

    Num(int b)
    {
        n = b;
    }

    void shownum()
    {
        System.out.println("Number: " + n);
    }
}

class HexNum extends Num
{
    HexNum(int a)
    {
        super(a);
    }

    void shownum()
    {
        super.shownum();

        char hex[] = {'0','1','2','3','4','5','6','7',
                      '8','9','A','B','C','D','E','F'};

        String c = "";

        long temp = n;

        boolean negative = false;

        if(temp < 0)
        {
            negative = true;
            temp = -temp;
        }

        if(temp == 0)
        {
            c = "0";
        }

        while(temp > 0)
        {
            int rem = (int)(temp % 16);
            char s = hex[rem];
            c = s + c;
            temp = temp / 16;
        }

        if(negative)
        {
            c = "-" + c;
        }

        System.out.println("Hexadecimal value: " + c);
    }
}

class HexDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        Num obj1 = new Num(num);
        HexNum obj2 = new HexNum(num);

        System.out.println("\nBase class:");
        obj1.shownum();

        System.out.println("\nDerived class:");
        obj2.shownum();
    }
}