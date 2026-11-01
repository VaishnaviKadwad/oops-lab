import java.util.Scanner;

class Student
{
    static int count;
    String Name;
    String usn;

    static
    {
        count = 0;
        System.out.println("Welcome to Student Enrollment System");
    }

    Student(String n, String u)
    {
        Name=n;
        usn=u;
        System.out.println("New student enrolled");
        count++;
    }

    void details()
    {
        System.out.println("Name: " + Name);
        System.out.println("USN: " + usn);
    }

    static void display()
    {
        System.out.println("Total number of students: " + count);
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
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.next();
            System.out.print("Enter USN of student " + (i + 1) + ": ");
            String usn = sc.next();

            s[i] = new Student(name, usn);
            s[i].details();
            System.out.println();
        }

        Student.display();
    }
}