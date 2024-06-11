import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number ");
        int a=sc.nextInt();

        while (a>0){
            int r=a%10;
            a=a/10;
            System.out.println(r);
        }
    }
}
