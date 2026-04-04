package MODULE2.HasARelation;
class Demo{
    void test(){
        System.out.println(" Executing test()......");
    }
}
class Sample{
    Demo ref =new Demo();

}
public class MainClass {
    public static void main(String[] args) {
        Sample obj=new Sample();
        obj.ref.test();
    }
}
