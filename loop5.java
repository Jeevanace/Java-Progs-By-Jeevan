import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number ");
        int a= sc.nextInt();

        for (int i=1;i<=a;i++){
            System.out.println("*");
        }
    }
}
