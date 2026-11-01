import java.util.Scanner;

class StringCompare {

    // Version 1: Compare two complete strings
    void usrstrcmp(String s1, String s2) {
        if (s1.equals(s2))
            System.out.println("Both strings are equal.");
        else
            System.out.println("Strings are not equal.");
    }

    // Version 2: Compare first n characters of two strings
    void usrstrcmp(String s1, String s2, int n) {
        String sub1, sub2;

        if (s1.length() < n)
            sub1 = s1;
        else
            sub1 = s1.substring(0, n);

        if (s2.length() < n)
            sub2 = s2;
        else
            sub2 = s2.substring(0, n);

        if (sub1.equals(sub2))
            System.out.println("First " + n + " characters are equal.");
        else
            System.out.println("First " + n + " characters are not equal.");
    }
}

public class TestStringCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        StringCompare obj = new StringCompare();

        // Compare complete strings
        obj.usrstrcmp(s1, s2);

        System.out.print("Enter number of characters to compare: ");
        int n = sc.nextInt();

        // Compare first n characters
        obj.usrstrcmp(s1, s2, n);

        sc.close();
    }
}