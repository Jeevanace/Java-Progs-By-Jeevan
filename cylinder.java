import java.util.Scanner;

public class cylinder {
    public  double radius;
    public  double height;

    public double lidarea(){
        return Math.PI*radius*radius;
    }
    public double surfacearea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public static void main(String[] args) {
        cylinder c = new cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        System.out.println("Enter the height: ");
        double h = sc.nextDouble();
        c.radius = r;
        c.height = h;
        System.out.println("Lid Area: " + c.lidarea());
        System.out.println("Surface Area: " + c.surfacearea());
        System.out.println("Volume: " + c.volume());
    }
}
