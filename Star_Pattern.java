import java.util.Scanner;

public class Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Of Rows ");
        int a= sc.nextInt();

        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
