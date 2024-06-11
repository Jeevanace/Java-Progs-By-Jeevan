import java.util.Scanner;

public class gp_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The First Number ");
        int a= sc.nextInt();

        System.out.print("Enter The Common Difference ");
        int r= sc.nextInt();

        System.out.print("Enter Number Of Terms ");
        int n= sc.nextInt();

        int term=a;
        for (int i=0;i<n;i++)
        {
            System.out.print(term+", ");
            term=term*r;
        }
    }
}
