// create a class circle and use inheritance to create another class cylinder from it.....




class circle2{
    public double radius;
     public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}

class cylinder2 extends circle2{
    public double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return area()*height;
    }

}




public class practice5 {
    public static void main(String[] args) {
        circle2 c = new circle2();
        c.setRadius(5);
        System.out.println("Area of circle = "+c.area());

        cylinder2 c2 = new cylinder2();
        c2.setRadius(5);
        c2.setHeight(10);
        System.out.println("Area of cylinder = "+c2.area());
        System.out.println("Volume of cylinder = "+c2.volume());
    }
}
