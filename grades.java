import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Marks Of Mathematics out of 100");
        float a= sc.nextFloat();
        System.out.println("Enter The Marks Of Physics out of 100");
        float b= sc.nextFloat();
        System.out.println("Enter The Marks Of Chemistry out of 100");
        float c= sc.nextFloat();
        System.out.println("Enter The Marks Of English out of 100");
        float d= sc.nextFloat();
        System.out.println("Enter The Marks Of Computer out of 100");
        float e= sc.nextFloat();

        float marks = a+b+c+d+e;
        float percent= marks/5;
        System.out.println("Total marks = 500 ");
        System.out.println("Marks Obtained = "+marks);
        System.out.println("Percentage Obtained = "+percent);

        if (percent >90){
            System.out.println("Phaad diya bhai");
        }
        else if (percent >75) {
            System.out.println("Bahut acha kiye be");
        }
        else if (percent >60) {
            System.out.println("Chal Sahi h");
        }
        else if (percent >45) {
            System.out.println("Thik Thak");
        }
        else if (percent >33) {
            System.out.println("Padh le re bhaya");
        }
        else
        {
            System.out.println("Nalla Marega Tu");
        }
    }
}
