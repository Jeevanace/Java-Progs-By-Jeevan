class method_override{
    public int a;
    public int jeevan(){
        return a;
    }
    public void meth2(){
        System.out.println("I am a method 2 of class method_override");
    }
}

class method_override2 extends method_override{
    public void meth2(){
        System.out.println("I am a method 2 of class method_override2");
    }
    public void meth3(){
        System.out.println("I am a method 3 of class method_override2");
    }
}



public class method_overriding {
    public static void main(String[] args) {
        method_override m=new method_override();
        m.meth2(); // returns the output of method 2 of class method_override
        method_override2 m2=new method_override2();
        m2.meth2(); // returns the output of method 2 of class method_override2
    }
}
