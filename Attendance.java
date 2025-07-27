import java.util.Scanner;
public class Attendance {
    int[][] a= new int[5][8];
    Scanner sc = new Scanner(System.in);
    void attendance()
    {
        int b;
        for(int i=0;i<5;i++)
        {
            System.out.println("Attendance for day "+(i+1));
            for(int j=0;j<8;j++)
            {
                System.out.println("Attendance for hour "+(j+1));
                System.out.println("Enter 1 0r 0 : ");
                b=sc.nextInt();
                if(b!=0&&b!=1)
                {
                    System.out.println("Invalid option 0 will be considered");
                    a[i][j]=0;
                }
                else
                    a[i][j] = b;
            }
        }
    }
    float dailyAverage(int n){
        float average=0;
        for(int i=0;i<8;i++)
        {
            average+=a[n][i];
        }
        average= (average/8)*100;
        System.out.println("The daily attendance of day "+(n+1)+" : "+average+" %");
        return average;
    }
    void weeklyAverage()
    {
        float average=0;
        for(int i=0;i<5;i++)
        {
            average+=dailyAverage(i);
        }
        System.out.println("The weekly average is "+(average/5)+" %");
    }
    public static void main(String[] args)
    {
    System.out.println("Name : T S Bhuvaneshwar\nRoll No: 2024503565");
    System.out.print("Enter the number of students : ");
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    Attendance[] obj = new Attendance[n];
    for(int i=0;i<n;i++)
    {
        obj[i] = new Attendance();
        System.out.println("Attedance for student "+(i+1));
        obj[i].attendance();
        obj[i].weeklyAverage();
    }

    }
}
