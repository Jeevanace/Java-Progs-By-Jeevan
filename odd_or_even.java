import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number ");
        int a=sc.nextInt();

        if (a%2==0){
            System.out.println("It is an Even Number");
        }
        else {
            System.out.println("It is an Odd Number ");
        }
    }
}
