import java.util.Scanner;

//class cylinders{
//    public double radius;
//    public double heigth;
//
//    public cylinders(double radius, double heigth) {
//        this.radius = radius;
//        this.heigth = heigth;
//    }
//
//    public double getHeigth() {
//        return heigth;
//    }
//
//    public void setHeigth(double heigth) {
//        this.heigth = heigth;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    public void area(){
//        System.out.println("Area = "+2*Math.PI*radius*heigth);
//    }
//    public void volume(){
//        System.out.println("Volume = "+Math.PI*radius*radius*heigth);
//    }
//    public void surfacearea(){
//        System.out.println("Surface Area = "+2*Math.PI*radius*heigth+2*Math.PI*radius*radius);
//    }
//}

class rect{
    private int length;
    private int breadth;

    public rect(){
        length =5;
        breadth =4;
    }
    public rect(int l, int b){
        length = l;
        breadth = b;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}


public class exercise4 {
    public static void main(String[] args) {
//        cylinders s=new cylinders(5,4);
//        //Scanner sc=new Scanner(System.in);
//        //System.out.println("Enter the radius : ");
//       // double a=sc.nextDouble();
////        System.out.println("Enter the height : ");
////        double b=sc.nextDouble();
//        s.setRadius(s.radius);
//        s.setHeigth(s.heigth);
//        s.area();
//        s.volume();
//        s.surfacearea();

        rect r=new rect();//returns 5,4
      //  rect r=new rect(10,20);//returns 10,20
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }
}
