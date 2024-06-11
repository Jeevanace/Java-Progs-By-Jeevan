//
//import java.util.Scanner;
//
//public class rectangle
//{
//    public double length;
//    public double breadth;
//
//    public double area() {
//        return length * breadth;
//    }
//
//    public double perimeter() {
//        return 2 * (length + breadth);
//    }
//
//    public static void main(String[] args) {
//
//        rectangle r = new rectangle();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length: ");
//        double l = sc.nextDouble();
//        System.out.println("Enter the breadth: ");
//        double b = sc.nextDouble();
//        r.length = l;
//        r.breadth = b;
//        System.out.println("Area of the rectangle: " + r.area());
//        System.out.println("Perimeter of the rectangle: " + r.perimeter());
//    }
//}

/*import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double length) {
        this.length = length > 0? length : 0;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth > 0? breadth : 0;
    }

    public double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth: ");
        double breadth = scanner.nextDouble();
        rectangle.setLength(length);
        rectangle.setBreadth(breadth);
        System.out.println("Area of the rectangle: " + rectangle.area());
    }
}*/

class rectangle {
    private double length;
    private double breadth;

    public rectangle()
    {
        length =1;
        breadth =1;
    }

    public rectangle(double l, double b)
    {
        length = l;
        breadth = b;
    }
}

class rectangletest {
    public static void main(String[] args) {
        rectangle r = new rectangle();// non parameterise constructor
        //rectangle r=new rectangle(10,20); // parameterised constructor
    }
}
