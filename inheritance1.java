class animal{
    public void eat(){
        System.out.println("eating");
    }
    public void run(){
        System.out.println("running");
    }
}
    class dog extends animal{
        public void bark(){
            System.out.println("barking");
        }
    }





public class inheritance1 {
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.run();
        d.bark();
    }
}
