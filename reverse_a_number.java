import java.util.Scanner;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number ");
        int a=sc.nextInt();

        int rev=0,r;

        while(a>0)
        {
            r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        System.out.println("After Reversing The Number Becomes = "+rev);
        
    }
}
