package MODULE2.ABSTRACTION.Interface;


interface Demo{
    void test();
}
class Sample implements Demo{
    @Override
    public void test() {
        System.out.println("Test method implementation in Sample class");
    }
}
public class MainClass1 {
    public static void main(String[] args) {
        Demo d=new Sample();
        d.test();
    }
}
