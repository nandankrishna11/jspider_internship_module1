package MODULE2.POLYMORPHISM.COMPILETIME;

public class Flipkart {
    void payment(){
        System.out.println("Card");

    }
    void payment(long cardNumber){
        System.out.println("Card");

    }
    void payment(String upiId){
        System.out.println("upi");

    }
}
