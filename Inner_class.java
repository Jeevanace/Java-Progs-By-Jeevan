class outer {
    int x = 10;

    class inner {
        int y = 20;

        public void innerdisplay() {
            System.out.println(x + " " + y);
        }
    }


    public void outerdisplay() {
        inner i = new inner();
        i.innerdisplay();
    }
}



public class Inner_class {
    public static void main(String[] args) {
        outer o=new outer();
        o.outerdisplay();
    }
}
