import java.util.Scanner;

public class ifcond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number ");
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("Even Number");
        }
        if (a%2!=0){
            System.out.println("Odd Number");
        }
    }
}
