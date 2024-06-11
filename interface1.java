interface testing
{
        void test1();
        void test2();
}
class tester implements testing{
    public void test1(){
        System.out.println("test1");
    }
    public void test2(){
        System.out.println("test2");
    }
}


public class interface1 {
    public static void main(String[] args)
    {
        testing t=new tester();
        t.test1();
        t.test2();
    }
}
