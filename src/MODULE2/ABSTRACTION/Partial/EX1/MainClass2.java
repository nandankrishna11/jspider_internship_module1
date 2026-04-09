package MODULE2.ABSTRACTION.Partial.EX1;


abstract class Alpha{
    abstract void play();
    void send(){
        System.out.println("executing send.......");
    }
}
class  Beta extends  Alpha{
    @Override
    void play(){
        System.out.println("Executing play..........");
    }
}
public class MainClass2 {
    public static void main(String[] args) {
        Alpha ref= new Beta();
        ref.play();
        ref.send();
    }
}
