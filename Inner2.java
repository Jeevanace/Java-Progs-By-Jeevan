// Example of inner class

class outer1
{
    static  int x=10;
    Inner i=new Inner();
    class Inner
    {
        int y = 20;
        public void innerdisplay()
        {
            System.out.println(x + " " + y);
        }
    }

    public void outerdisplay()
    {
        i.innerdisplay();
        System.out.println(i.y);
    }
}




public class Inner2 {
    public static void main(String[] args) {
        outer1.Inner i=new outer1().new Inner();
        i.innerdisplay();
    }
}
