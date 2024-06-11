class jeevan{
    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}



public class cwh_40_accessmodifier {
    public static void main(String[] args) {

        jeevan j=new jeevan();
        j.setId(10);
        j.setName("Jeevan");
        System.out.println(j.getName() + "\n" + j.getId());
    }
}
