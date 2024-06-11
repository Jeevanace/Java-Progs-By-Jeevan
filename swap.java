import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Number ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number ");
        int b=sc.nextInt();

        int temp=a;
        a=b;
        b=temp;

        System.out.println("After Swapping The Result Is ");
        System.out.println("The First Number = "+a);
        System.out.println("The Second Number = "+b);
    }
}
