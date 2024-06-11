import java.util.Scanner;

public class max_of_three {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number ");
        int a= sc.nextInt();
        System.out.println("Enter Second Number ");
        int b= sc.nextInt();
        System.out.println("Enter Third Number ");
        int c=sc.nextInt();

        if (a>b&&a>c) {
            System.out.println("The largest Number is " + a);
        }
        else{
            if (b>c){
                System.out.println("The largest Number is "+b);
            }
            else{
                System.out.println("The Largest Number is "+c);
            }
        }
    }
}
