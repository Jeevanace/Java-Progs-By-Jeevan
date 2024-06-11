import java.util.Scanner;

class sph{
    public double radius;

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void area(){
        System.out.println("Area = "+4*Math.PI*radius*radius);
    }
    public void volume(){
        System.out.println("Volume = "+4/3*Math.PI*radius*radius*radius);
    }
}




public class sphere {
    public static void main(String[] args) {
        System.out.println("Enter the radius: ");
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        sph s=new sph();
        s.setRadius(r);
        s.area();
        s.volume();
    }
}
