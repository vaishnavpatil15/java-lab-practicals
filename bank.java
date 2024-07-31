import java.util.Scanner;

class account
{
    Scanner sc =new Scanner(System.in);
    double balance;
    double monthlyInsterest;
    static double interest;

    // account(double n)
    // {
    //     balance=n;
    // }

    static void modify(double rate)
    {
        interest=rate;
    }

    void display()
    {
        monthlyInsterest=(balance*interest)/1200;
        balance+=monthlyInsterest;
        System.out.println("\n\n--------- Informatiuon of the Account ----------\n");
        System.out.println("Interest Rate : " + interest);
        System.out.println("Monthly interest : " + monthlyInsterest);
        System.out.println("Current Balance : " + balance);
    }
    void get()
    {
        System.out.print("\nEnter balance of the account : ");
        balance=sc.nextInt();
    }

}



class bank {
    public static void main(String[] args)
    {
        account s1 =new account();
        account s2 =new account();

        s1.get();
        s2.get();

        account.modify(10);

        s1.display();
        s2.display();

        account.modify(12);
        s1.display();
        s2.display();

    }
}
