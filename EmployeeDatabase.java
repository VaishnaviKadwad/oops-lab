import java.util.Scanner;

class Employee
{
    String name;
    int emp_id;
    String department;
    int age;
    String designation;
    double salary;

    void read(Scanner sc)
    {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        emp_id = sc.nextInt();

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department: ");
        department = sc.nextLine();

        System.out.print("Enter designation: ");
        designation = sc.nextLine();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    
}

class EmployeeDatabase
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Employee e[] = new Employee[5];

        for(int i = 0; i < 5; i++)
        {
            e[i] = new Employee();

            System.out.println("\nEnter details of Employee " + (i + 1));
            e[i].read(sc);
        }

        System.out.println("\n----- Employee Details -----");

        for(int i = 0; i < 5; i++)
        {
            e[i].display();
            System.out.println();
        }

        double sum = 0;

        for(int i = 0; i < 5; i++)
        {
            if (e[i].department.equalsIgnoreCase("sales"))
            {
                sum = sum + e[i].salary;
            }
        }

        System.out.println("Total salary of Sales department: " + sum);

        int max = -1;

        for(int i = 0; i < 5; i++)
        {
            if (e[i].department.equalsIgnoreCase("purchase")
            && e[i].designation.equalsIgnoreCase("manager"))
            {
                if(max == -1 || e[i].salary > e[max].salary)
                {
                    max = i;
                }
            }
        }

        if(max == -1)
        {
            System.out.println("No manager found in purchase department");
        }
        else
        {
            System.out.println("\nHighest paid manager in Purchase department:");
            e[max].display();
        }
    }
}