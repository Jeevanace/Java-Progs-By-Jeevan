class phone{
    public void time(){
        System.out.println("The time is 10:30 AM");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}

class smartphone extends phone{

    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on smartphone");
    }
}



public class method_dispatch {
    public static void main(String[] args) {
        phone obj = new smartphone(); // allowed
        //smartphone obj = new phone(); // not allowed
        obj.on();
        obj.time();
        //obj.music(); // not allowed
    }
}
