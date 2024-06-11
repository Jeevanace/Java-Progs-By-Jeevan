/*  Q1>> create a class emp with some properties as mentioned
1. salary int property
2. getSalary(method returning salary)
3. setName
4. getName
5.name (property)


class Employee{

    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name=n;
    }
}

public class cwh_39_practice {
    public static void main(String[] args) {
        Employee Jeevan = new Employee();
        Jeevan.setName("Jeevan");
        Jeevan.salary = 30000;
        System.out.println("Name : "+Jeevan.getName() + "\nSalary : " + Jeevan.getSalary());
    }
}*/

//Q2>>create a class cellphone with methods to print "ringing","vibrating","calling" and disconnecing

/*class Cellphone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void call(){
        System.out.println("Calling");
    }
    public void disconnect(){
        System.out.println("Disconnecting");
    }
}

class cwh_39_practice {
    public static void main(String[] args) {
        Cellphone Jeevan = new Cellphone();
        Jeevan.ring();
        Jeevan.vibrate();
        Jeevan.call();
        Jeevan.disconnect();
    }
}*/



//Q3>> Create a class square with a method to calculate area of square,side, perimeter of square

/*import java.util.Scanner;

class Square{
    int s;
    Square(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        s=sc.nextInt();
    }

    public int side(){
        return s;
    }
    public int area(int s){
        return s*s;
    }
    public int perimeter(int s){
        return 4*s;
    }
}

class cwh_39_practice {
    public static void main(String[] args) {
        Square Jeevan = new Square();
        System.out.println("Area of Square : "+Jeevan.area(Jeevan.side()));
        System.out.println("Perimeter of Square : "+Jeevan.perimeter(Jeevan.side()));
    }
}*/

//Q4>> Create a class rectangle with a method to calculate area of rectangle,side, perimeter of rectangle

import java.sql.SQLOutput;
import java.util.Scanner;
/*import java.util.Scanner;

class rectangle1{
    int l,b;
    Scanner sc=new Scanner(System.in);
    rectangle1(){
        System.out.println("Enter the length of rectangle : ");
        l=sc.nextInt();
        System.out.println("Enter the breadth of rectangle : ");
        b=sc.nextInt();
    }

    public int area(int l,int b){
        return l*b;
    }
    public int perimeter(int l,int b){
        return 2*(l+b);
    }
}

public class cwh_39_practice {
    public static void main(String[] args) {
        rectangle1 r=new rectangle1();
        System.out.println("Area = "+r.area(r.l,r.b));
        System.out.println("Perimeter = "+r.perimeter(r.l,r.b));

        
    }
}*/

/*class TommyVecetti{
    public void hit(){
        System.out.println("Hitting");
    }
    public void block(){
        System.out.println("Blocking");
    }
    public void tackle(){
        System.out.println("Tackling");
    }

    public void run(){
        System.out.println("Running");
    }
}

class cwh_39_practice {
    public static void main(String[] args) {
        TommyVecetti Jeevan = new TommyVecetti();
        Jeevan.hit();
        Jeevan.block();
        Jeevan.tackle();
        Jeevan.run();
    }
}*/

class circletest{
    double r;
    Scanner sc=new Scanner(System.in);
    circletest(){
        System.out.println("Enter the radius of circle : ");
        r=sc.nextDouble();
    }

    public double area(){
        return Math.PI*r*r;
    }
    public double perimeter(){
        return 2*Math.PI*r;
    }
}

class cwh_39_practice {
    public static void main(String[] args) {
        circletest Jeevan = new circletest();
        System.out.println("Area = "+Jeevan.area());
        System.out.println("Perimeter = "+Jeevan.perimeter());
    }
}