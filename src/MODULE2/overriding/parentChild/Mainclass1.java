package MODULE2.overriding.parentChild;


class Parent{
    void watchTv(){
        System.out.println("news/serial");
    }
}
class Child extends Parent{
    @Override
    void watchTv(){
        System.out.println("music/sports");
    }
}
public class Mainclass1 {
    public static void main(String[] args) {
        Parent p =new Parent();
        p.watchTv();
        Child c= new Child();
        c.watchTv();
        Parent ref =new Child();
        ref.watchTv();
    }
}
