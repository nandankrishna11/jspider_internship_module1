package MODULE2.HasARelation;


class Camera{
    void photo(){
        System.out.println("Photo is clicked");
    }
}
class SimCard{
    void call(){
        System.out.println("Calling");
    }
}
class Mobile{
    Camera c=new Camera();//Mobile has a Camera : Composition
    SimCard s;//Mobile has a SimCard : Aggregation
    Mobile(SimCard s){
        this.s=s;
    }
}
public class MainClass5 {
    public static void main(String[] args) {
        SimCard s1=new SimCard();
        Mobile m1=new Mobile(s1);
        m1.c.photo();
        m1.s.call();

    }
}
