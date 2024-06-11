import java.util.Scanner;

public class conditional2 {
    public static void main(String[] args) {
        System.out.println("Enter Any Name or Leave It As It is ......");
        Scanner sc=new Scanner(System.in);
        String a=sc.next();

        String name=a;
        System.out.println(name.isEmpty() ? "This is empty field" : name);
    }
}
