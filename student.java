import java.util.Scanner;

public class student {
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total() {
        return m1+m2+m3;
    }
    public double percentage() {
        return total()/3.0;
    }
    public float average() {
        return (m1+m2+m3)/3.0f;
    }
    public String grade() {
        if (percentage() >= 90) {
            return "A";
        } else if (percentage() >= 80) {
            return "B";
        } else if (percentage() >= 70) {
            return "C";
        } else if (percentage() >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public String details() {
        return ("Roll no: "+roll+"\nName: "+name+"\nCourse: "+course);
    }
}
class studentdetails {
    public static void main(String[] args) {
        student s = new student();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll no: ");
        int r = sc.nextInt();
        s.roll = r;
        System.out.println("Enter the name: ");
        String n = sc.next();
        s.name = n;
        System.out.println("Enter the course: ");
        String c = sc.next();
        s.course = c;
        System.out.println("Enter the marks of first subject: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the marks of second subject: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the marks of third subject: ");
        int n3 = sc.nextInt();
        s.m1 = n1;
        s.m2 = n2;
        s.m3 = n3;
        System.out.println(s.details());
        System.out.println("Total marks: "+s.total());
        System.out.println("Percentage: "+s.percentage());
        System.out.println("Grade: "+s.grade());
        System.out.println("Average: "+s.average());
    }
}