//create a class rectangle and inherit a class cuboid from it to perform actions on rectangle and cuboid
import java.util.Scanner;

class rectangles{
    int length;
    int breadth;
    int area(){
        return length*breadth;
    }

    int perimeter(){
        return 2*(length+breadth);
    }
}
 class cuboid extends rectangles{
    int height;
    int volume(){
        return area()*height;
    }
    int surfacearea(){
        return 2*(area()+perimeter());
    }
 }




public class practice6 {
    public static void main(String[] args) {

        rectangles r = new rectangles();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length : ");
        int a = sc.nextInt();
        System.out.println("Enter the breadth : ");
        int b = sc.nextInt();
        r.length = a;
        r.breadth = b;
        System.out.println("Area of rectangle = "+r.area());
        System.out.println("Perimeter of rectangle = "+r.perimeter());




        cuboid c = new cuboid();
        Scanner obj= new Scanner(System.in);
        c.length = a;
        c.breadth = b;
        System.out.println("Enter the height : ");
        int h = obj.nextInt();
        c.height = h;

        System.out.println("Area of cuboid = "+c.area());
        System.out.println("Perimeter of cuboid = "+c.perimeter());
        System.out.println("Volume of cuboid = "+c.volume());
        System.out.println("Surface Area of cuboid = "+c.surfacearea());
    }
}
