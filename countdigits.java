import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Any Number ");
            int a=sc.nextInt();
            int count=0;

            while (a>0){
                a=a/10;
                count++;
            }
        System.out.println(count);
    }
}
