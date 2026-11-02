import java.util.Scanner;
class Payment
{
    double amount;
    Payment(double amt)
    {
        amount = amt;
    }
    void processPayment()
    {
        System.out.println("Processing payment of amount: " + amount);
    }
}
class CreditCardPayment extends Payment
{
    CreditCardPayment(double amt)
    {
        super(amt);
    }
    void processPayment()
    {
        double charge = amount * 0.02;
        double total = amount + charge;
        System.out.println("Processing credit card payment of amount: " + total);
    }
}
class UPIPayment extends Payment
{
    UPIPayment(double amt)
    {
        super(amt);
    }
    void processPayment()
    {
        double charge = 5;
        double total = amount + charge;
        System.out.println("Processing UPI payment of amount: " + total);
        
    }
}
class NetBankingPayment extends Payment
{
    NetBankingPayment(double amt)
    {
        super(amt);
    }
    void processPayment()
    {
        double charge = amount * 0.015;
        double total = amount + charge;
        System.out.println("Processing net banking payment of amount: " + total);
    }
}
public class PaymentDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter payment amount: ");
        double amt = sc.nextDouble();
        System.out.println("Select payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");
        int choice = sc.nextInt();
        Payment p;
        switch(choice)
        {
            case 1:
                p = new CreditCardPayment(amt);
                break;
            case 2:
                p = new UPIPayment(amt);
                break;
            case 3:
                p = new NetBankingPayment(amt);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        p.processPayment();
    }
}