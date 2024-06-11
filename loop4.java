import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number ");
        int a= sc.nextInt();

        for (int i=0,j=0; i<10;i++,j=j*2)
        {
            System.out.println(i);
        }
    }
}
