import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number ");
        int a= sc.nextInt();

        for (int i=a;i>0;i--)
        {
            System.out.println(i);
        }
    }
}
