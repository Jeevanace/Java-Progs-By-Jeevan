import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number ");
        int a= sc.nextInt();
        System.out.println("Enter Second Number ");
        int b= sc.nextInt();

        int max = a>b ? a:b;
        System.out.println("The greatest number is "+max);

        int min =a<b ? a:b;
        System.out.println("The smaller number is "+min);
    }
}
