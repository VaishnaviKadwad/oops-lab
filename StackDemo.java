import java.util.Scanner;

class Stack
{
    int a[] = new int[10];
    int top = -1;

    void push(int item)
    {
        if(top == 9)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            a[top] = item;
            System.out.println("Element inserted");
        }
    }

    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Deleted element: " + a[top]);
            top--;
        }
    }

    void display()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack elements:");
            for(int i = top; i >= 0; i--)
            {
                System.out.println(a[i]);
            }
        }
    }
}

class StackDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Stack s = new Stack();

        int ch = 0;
        int ele;

        while(ch != 4)
        
        {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.print("Enter element: ");
                    ele = sc.nextInt();
                    s.push(ele);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}