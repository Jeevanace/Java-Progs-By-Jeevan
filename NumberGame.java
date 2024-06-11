import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputNumber;
    public int noofguesses;

    public int getNoofguesses() {
        return noofguesses;
    }

    public void getNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }

    game(){
        Random r = new Random();
        this.number = r.nextInt(100);
    }

    void takeuserinput(){
        System.out.println("Guess any number  !!!!");
        Scanner sc = new Scanner(System.in);
        this.inputNumber = sc.nextInt();
    }

    boolean iscorrectnumber(){
        noofguesses++;
        if(this.inputNumber == this.number){
            System.out.println("Yes you guesses it correctly in "+noofguesses+" guesses");
            return true;
        } else if (inputNumber<number) {
            System.out.println("Too Low");
        } else if (inputNumber>number) {
            System.out.println("Too High");
        }
        return false;
    }
}




public class NumberGame {
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while(!b){
            g.takeuserinput();
            b=g.iscorrectnumber();
        }
    }
}
