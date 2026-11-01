import java.util.Scanner;
class Person
{
    String name;
    int age;
    String gender;

    void read(Scanner sc)
    {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter gender: ");
        gender = sc.nextLine();
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
class Student extends Person
{
    String usn;
    String branch;

    void read(Scanner sc)
    {
        super.read(sc);

        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter branch: ");
        branch = sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("USN: " + usn);
        System.out.println("Branch: " + branch);
    }
}
class Employee extends Person
{
    int emp_id;
    String department;

    void read(Scanner sc)
    {
        super.read(sc);

        System.out.print("Enter Employee ID: ");
        emp_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department: ");
        department = sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Department: " + department);
    }
}
class PersonDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student [] s = new Student[5];
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter details of student " + (i + 1) + ":");
            s[i] = new Student();
            s[i].read(sc);
        }
        Employee [] e = new Employee[5];
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter details of employee " + (i + 1) + ":");
            e[i] = new Employee();
            e[i].read(sc);
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.println("\nDetails of student " + (i + 1) + ":");
            s[i].display();
        }
        for(int i = 0; i < 5; i++)
        {
            System.out.println("\nDetails of employee " + (i + 1) + ":");
            e[i].display();
        }
        
    }
}