import java.util.*;
class test1{
    public double radius;
    public double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void volume(){
        System.out.println("Volume = "+Math.PI*radius*radius*height/3);
    }

    public void surfacearea(){
        System.out.println("Surface Area = "+Math.PI*radius*(radius+Math.sqrt(height*height+radius*radius)));
    }
}





public class cone {
    public static void main(String[] args) {
        test1 c= new test1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r=sc.nextDouble();
        System.out.println("Enter the height: ");
        double h=sc.nextDouble();
        c.setRadius(r);
        c.setHeight(h);
        c.volume();
        c.surfacearea();
    }
}
