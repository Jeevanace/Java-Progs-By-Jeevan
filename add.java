import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        int x,y,sum;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The FIrst Number : ");
        int a= sc.nextInt();
        System.out.print("Enter The Second Number : ");
        int b= sc.nextInt();

        sum=a+b;
        System.out.print("Sum Of Two Numbers Is = "+sum);
    }
}
