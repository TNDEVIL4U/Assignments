import java.util.Scanner;
public class Bank {
    private static int totalAccounts;
    private int accountNumber ;
    private float balance;
    private float defaultBalance = 1000;
    private String accountHolderName;

    Bank(int accountNumber,String accountHolderName)
    {
        this.accountNumber = accountNumber;
        this.balance = defaultBalance;
        this.accountHolderName = accountHolderName;
        System.out.println("Account created successfully");
        totalAccounts++;
    }
    private void deposit(int amount)
    {
        Scanner sc = new Scanner(System.in);
        byte a;
        balance += amount;
        System.out.println("The amount "+amount+" added successfully\nEnter 1 to Display the total balance : ");
        a = sc.nextByte();
        if(a==1)
            System.out.println("Your balance is Rs."+balance);
    }
    public static void totalAccounts()
    {
        System.out.println("Total account created : "+totalAccounts);
    }
    public void display()
    {
        System.out.println("Name : "+accountHolderName+"\nAccount Number : "+accountNumber+"\nBalance : "+balance);
    }
    public static void main(String [] args)
    {
        System.out.println("Name : T S Bhuvaneshwar\nRoll No: 2024503565");
        Scanner sc = new Scanner(System.in);
        int n;
        boolean a  = true;
        int amount;
        byte c;
        int found = -1;
        System.out.print("Enter the number of accounts you want to create : ");
        n = sc.nextInt();
        Bank[] obj = new Bank[n];
        int accountNumber;
        float balance;
        String accountHolderName;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter account number : ");
            accountNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter account Holder Name : ");
            accountHolderName = sc.nextLine();
            obj[i] = new Bank(accountNumber,accountHolderName);
        }

        System.out.println("Enter 1 to deposit\nEnter 2 to display details\nEnter 3 to exit");
        while(a){
            System.out.print("Enter choice : ");
            c = sc.nextByte();
            if(c==3||(c!=1&&c!=2))
                break;
            System.out.print("Enter the account number : ");
            accountNumber = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                if(obj[i].accountNumber==accountNumber)
                    found=i;

            }
        if(found==-1)
        {
            System.out.print("Account not found\nRecheck account number");
            break;
        }
        a =true;
        if(c==1)
            {
            System.out.print("Enter the amount : ");
            amount = sc.nextInt();
                {
                    obj[found].deposit(amount);

        }
            }
        else if(c==2)
            {
                obj[found].display();
            }
        else
        {
            break;
        }
    found=-1;}

        totalAccounts();
    }
    }


