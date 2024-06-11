import java.util.Scanner;

public class circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class circle1{
    public static void main(String[] args) {
        circle c = new circle();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        c.radius = r;
        System.out.println("Area of the circle: "+c.area());
        System.out.println("Perimeter of the circle: "+c.perimeter());
    }
}
