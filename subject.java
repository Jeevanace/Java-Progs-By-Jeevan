public class subject {
    public String subID;
    public String name;
    private int MaxMarks;
    private int marksObtain;

    public subject(String subID, String name, int MaxMarks, int marksObtain) {
        this.subID = subID;
        this.name = name;
        this.MaxMarks = MaxMarks;
        this.marksObtain = marksObtain;
    }

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return MaxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMarksObtain(int mm) {
        this.marksObtain = mm;
    }

    public void setmarksObtain(int m) {
        this.marksObtain = m;
    }
    boolean isPass() {
        if (marksObtain >= MaxMarks / 10*4) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Subject Id : "+subID + "\nSubject Name : " + name + "\nMax Marks : " + MaxMarks + "\nMarks Obtain : " + marksObtain;
    }
}

class Scoop3{
    public static void main(String[] args) {
        subject subs[]=new subject[3];
        subs[0]=new subject("101","Maths",100,90);
        subs[1]=new subject("102","Science",100,85);
        subs[2]=new subject("103","Social",100,80);

        for (subject s:subs){
            System.out.println(s);
        }
    }
}
