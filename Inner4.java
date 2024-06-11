// Example Of Anonymous Inner Class
abstract class My {
    abstract void display();
}

class outer4{
    public void meth()
    {
        My m = new My()
        {
            public void display()
            {
                System.out.println("Hello");
            }
        };
        m.display();
    }
}



public class Inner4 {
    public static void main(String[] args) {

        outer4 o = new outer4();
        o.meth();
    }
}
