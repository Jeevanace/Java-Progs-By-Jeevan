class base{
    base(){
        System.out.println("I am a constructor with no parameter");
    }
    base(int x){
        System.out.println("I am a overloaded constructor with value of x as : "+x);
    }
}

class derived extends base{
    derived(){
       // super(0);
        System.out.println("I am a derived class constructor with no parameter");
    }
    derived(int x,int y){
        super(x);
        System.out.println("I  am a overloaded constructor with value of z as : "+y);
    }
}
class childofderived extends derived{
    childofderived(){
        System.out.println("I am a child class constructor of derived class with no parameter");
    }
    childofderived(int x,int y, int z){
        super(x,y);
        System.out.println("I am a overloaded constructor with value of z as : "+z);
    }
}



public class constructor_overloading_in_inheritance {
    public static void main(String[] args) {

        //The below line will execute the parameterised constructor of the base class

        System.out.println("The below line will execute the parameterised constructor of the base class\n");

        base b = new base(10);
        System.out.println("\n");

        derived d = new derived(10 ,20);
        System.out.println("\n");

        childofderived c = new childofderived(10,20,30);
        System.out.println("\n");

        //The below line will execute the default constructor of the base class

        System.out.println("The below line will execute the default constructor of the base class\n");

        base b1 = new base();
        System.out.println("\n");

        derived d1 = new derived();
        System.out.println("\n");

        childofderived c1 = new childofderived();
    }
}
