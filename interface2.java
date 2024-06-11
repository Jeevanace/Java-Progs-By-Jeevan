class phones
{
    public void call(){
        System.out.println("It is calling");
    }
    public void ring(){
        System.out.println("It is ringing");
    }
}

interface camera
{
    public void snap();
    public void record();
}

interface musicplayer
{
    public void play();
    public void stop();
}

class smartphones extends phones implements camera,musicplayer
{
    public void videocall(){
        System.out.println("It is videocalling");
    }
    public void snap(){
        System.out.println("It is snapping");
    }
    public void record(){
        System.out.println("It is recording");
    }
    public void play(){
        System.out.println("It is playing");
    }
    public void stop(){
        System.out.println("It is stopping");
    }
}


public class interface2
{
    public static void main(String[] args) {
        smartphones sp=new smartphones();
        sp.call();
        sp.ring();
        sp.videocall();
        sp.snap();
        sp.record();
        sp.play();
        sp.stop();
    }
}
