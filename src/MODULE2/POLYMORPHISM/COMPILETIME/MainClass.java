package MODULE2.POLYMORPHISM.COMPILETIME;

public class MainClass {
    public static void main(String[] args) {
        Flipkart f=new Flipkart();
        f.payment();
        f.payment(1234567890123456L);
        f.payment("abc@upi");
    }
}
