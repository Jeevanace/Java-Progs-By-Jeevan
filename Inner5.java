// Example Of Static Inner Class

class Outer5{
    static int x=10;
    int y = 5;

    static class inner{
        void display(){
            System.out.println(x);
       //System.out.println(y); // IT WILL NOT EXECUTE AS STATIC CLASS CAN ONLY ACCESS THE STATIC MEMBERS OF OUTER CLASS
        }
    }
}


public class Inner5 {
    public static void main(String[] args) {
        Outer5.inner i = new Outer5.inner();
        i.display();
    }
}
