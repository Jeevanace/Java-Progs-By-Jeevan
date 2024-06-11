import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        String a,b;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        a=sc.next();
        System.out.print("Enter Your F_Name : ");
        b=sc.next();
        System.out.print("Enter Your Age : ");
        c=sc.nextInt();
        System.out.println("Your Name : "+a+"\nYour F_Name : "+b+"\nYour Age : "+c);
    }
}
