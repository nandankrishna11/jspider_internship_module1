package MODULE2.overriding.motorCycle;
class Father{
    void motorCycle(){
        System.out.println("normal");
    }
}
class Son extends Father{
    void motorCycle(){
        System.out.println("modified");
    }
}
public class MainClass2 {
    public static void main(String[] args) {
        Father f= new Father();
        f.motorCycle();
        Son s=new Son();
        s.motorCycle();
        f=s;
        f.motorCycle();
    }
}
