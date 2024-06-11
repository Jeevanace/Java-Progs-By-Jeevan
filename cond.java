import java.util.Scanner;

public class cond {
    //practice for conditional operators
/* Maximum of three numbers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();

        int max= a >b ? (a>c ? a:c) : (b>c ? b:c);
        System.out.println(max);*/

    // positive or negative

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();

        if (a>0){
            System.out.println("It is a positive number ");
        }
        else {
            System.out.println("It is a negative number");
        }
    }
}
