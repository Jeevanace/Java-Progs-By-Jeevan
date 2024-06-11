import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Name : ");
        String a=sc.next();

        System.out.print("Enter Basic Pay : ");
        float b=sc.nextFloat();

        float hra=0f;
        float da=0f;
        float ta=0f;
        float food=0f;



        if (b>25000){
            hra = b * 10/100;
            da = b * 5/100;
            ta = b * 2/100;
            food = 1500;
        }
        else {
            hra = b * 5/100;
            da = b * 25/1000;
            ta = b * 1/100;
            food = 500;
        }

        float gross_salary= b+hra+da+ta+food;

        System.out.println("*****************************************************************************");
        System.out.println("Name : "+a);
        System.out.println("Basic Salary = "+b);
        System.out.println("HRA = "+hra);
        System.out.println("DA = "+da);
        System.out.println("TA = "+ta);
        System.out.println("Food = "+food);

        System.out.println("Gross Salary = "+gross_salary);
    }
}
