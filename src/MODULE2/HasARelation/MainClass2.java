package MODULE2.HasARelation;
class Test{
    void play(){
        System.out.println("Executing play()......");
    }
}
class Example{
    Test ref;
    Example(Test ref){
        this.ref=ref;
    }
}
public class MainClass2 {
    public static void main(String[] args) {
        Test t1=new Test();
        Example e1=new Example(t1);
        e1.ref.play();
    }
}
