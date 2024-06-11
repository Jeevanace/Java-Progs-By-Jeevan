//  Example of Local Inner Class

class outer3{
    void display(){
        class Inner{
            void innerdisplay(){
                System.out.println("Hello");
            }
        }

        Inner i = new Inner();
        i.innerdisplay();
    }
}


public class inner3 {
    public static void main(String[] args) {

    }
}
