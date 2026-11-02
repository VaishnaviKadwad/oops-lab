import java.util.Scanner;

class Student
{
    static int count;

    int m1, m2, m3;
    double average;

    static
    {
        count = 0;
        System.out.println("Welcome to University Enrollment System");
    }

    Student()
    {
        count++;
    }

    void read(Scanner sc)
    {
        System.out.print("Enter first test mark: ");
        m1 = sc.nextInt();

        System.out.print("Enter second test mark: ");
        m2 = sc.nextInt();

        System.out.print("Enter third test mark: ");
        m3 = sc.nextInt();
    }

    void calculate()
    {
        int lowest;

        if(m1 <= m2 && m1 <= m3)
        {
            lowest = m1;
        }
        else if(m2 <= m1 && m2 <= m3)
        {
            lowest = m2;
        }
        else
        {
            lowest = m3;
        }

        average = (m1 + m2 + m3 - lowest) / 2.0;
    }

    void display()
    {
        System.out.println("Test marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Average of best two marks: " + average);
    }

    static void displayCount()
    {
        System.out.println("Total students enrolled: " + count);
    }
}

class StudentDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student s[] = new Student[n];

        for(int i = 0; i < n; i++)
        {
            s[i] = new Student();

            System.out.println("\nEnter marks of Student " + (i + 1));
            s[i].read(sc);

            s[i].calculate();
        }

        System.out.println("\n----- STUDENT DETAILS -----");

        for(int i = 0; i < n; i++)
        {
            System.out.println("\nStudent " + (i + 1));
            s[i].display();
        }

        Student.displayCount();
    }
}