import java.util.Scanner;

public class star_pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number Of Rows ");
        int a= sc.nextInt();

        for (int i=1;i<=a;i++)
        {
            for (int j=1;j<=a;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}