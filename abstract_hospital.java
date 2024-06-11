abstract class hospital{
    abstract void emergency();
    abstract void surgery();
    abstract void billing();
    abstract void pharma();
}

class hospital1 extends hospital{
    void emergency(){
        System.out.println("it is emergency condition");
    }
    void surgery(){
        System.out.println("it is surgery");
    }
    void billing(){
        System.out.println("it is billing");
    }
    void pharma(){
        System.out.println("it is pharma");
    }
}



public class abstract_hospital {
    public static void main(String[] args) {
        hospital h = new hospital1();
        h.emergency();
        h.surgery();
        h.billing();
        h.pharma();
    }
}
