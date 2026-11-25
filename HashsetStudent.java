
import java.util.*;

public class HashsetStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> students = new HashSet<>();

        int choice;

        do {
            System.out.println("\n--- STUDENT MANAGEMENT ---");
            System.out.println("1. Add student");
            System.out.println("2. Display students");
            System.out.println("3. Remove student");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    if (students.add(name))
                        System.out.println("Student added successfully");
                    else
                        System.out.println("Duplicate name! Not added");
                    break;

                case 2:
                    System.out.println("Student names:");

                    Iterator<String> it = students.iterator();

                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
                    break;

                case 3:
                    System.out.print("Enter name to remove: ");
                    String remove = sc.nextLine();

                    if (students.remove(remove))
                        System.out.println("Student removed");
                    else
                        System.out.println("Student not found");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
