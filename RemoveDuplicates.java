import java.util.Scanner;

class RemoveDuplicates
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            if(a[i] != 0)
            {
                for(int j = i + 1; j < n; j++)
                {
                    if(a[i] == a[j])
                    {
                        a[j] = 0;
                    }
                }
            }
        }

        System.out.println("Updated array:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}