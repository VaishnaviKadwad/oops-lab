import java.util.Scanner;

class TooOlder extends Exception
{
    TooOlder(String msg)
    {
        super(msg);
    }
}

class TooYounger extends Exception
{
    TooYounger(String msg)
    {
        super(msg);
    }
}

public class EmployeeRecruitment
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter candidate name: ");
        String name = sc.nextLine();

        System.out.print("Enter candidate age: ");
        int age = sc.nextInt();

        try
        {
            if (age > 45)
            {
                throw new TooOlder(
                    "Candidate is too old for recruitment.");
            }
            else if (age < 25)
            {
                throw new TooYounger(
                    "Candidate is too young for recruitment.");
            }
            else
            {
                System.out.println("Eligible");
                System.out.println("Candidate Name: " + name);
            }
        }
        catch (TooOlder e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (TooYounger e)
        {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}