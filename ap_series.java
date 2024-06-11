import java.util.Scanner;

public class ap_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The First Term ");
        int a= sc.nextInt();

        System.out.print("Enter The Difference ");
        int b= sc.nextInt();

        System.out.print("Enter The Number Of Terms ");
        int c= sc.nextInt();

        int term=a;
        for (int i=0;i<c;i++)
        {
            System.out.print(term+", ");
            term=term+b;
        }

    }
}
