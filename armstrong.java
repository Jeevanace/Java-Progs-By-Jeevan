import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number ");
        int a=sc.nextInt();

        int m=a;
        int sum=0;
        int r;

        while (a>0){
            r=a%10;
            a=a/10;
            sum=sum+r*r*r;
        }

        if(sum==m)
            System.out.println("It is an Armstrong Number ");
        else
            System.out.println("It is not an Armstrong Number ");
    }
}
