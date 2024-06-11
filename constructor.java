class Mymainemployee{
    private int id;
    private String name;

    public Mymainemployee(int i, String n) { //if no argument is passed in main section it will return 0 and Jeevan
        id = 1;
        name = "Jeevan";
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }
}



public class constructor {
    public static void main(String[] args) {
        Mymainemployee jeevan=new Mymainemployee(1,"Jeevan");//returns Jeevan and 1 as it is parameterised
        // agr constructor me parameter pass kare toh default constructor chalega

//        jeevan.setName("Mishra");  // returns Mishra
//        jeevan.setId(10);     // returns 10
        System.out.println(jeevan.getName() + "\n" + jeevan.getId());

    }
}
