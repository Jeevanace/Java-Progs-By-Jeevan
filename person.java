public class person {
    String name;
    int age;

    public person(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {

        person Person1 = new person("Jeevan", 21);
        System.out.printf("Name : " + Person1.name + "\nAge : " + Person1.age);
    }
}
