import java.util.Scanner;

public class star_pattern2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Of Rows ");
        int a= sc.nextInt();

        for (int i=a;i>0;i--) //outer loop
        {
            for (int j=1;j<=i;j++) //inner loop
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}