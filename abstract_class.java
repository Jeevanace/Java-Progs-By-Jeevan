abstract class Super1{
    public Super1(){
        System.out.println("Constructor of Super1");
    }
    public void method1(){
        System.out.println("Method 1 of Super1");
    }

    abstract  public void method2();
}

class subclass1 extends Super1{
    public void method2(){
        System.out.println("Method 2 of subclass1");
    }
}


class abstract_class{
    public static void main(String[] args) {
        Super1 s=new subclass1();
        s.method1();
        s.method2();
    }
}