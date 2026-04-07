package MODULE2.JAVABEANCLASS.ex3;

public class MainClass {
    public static void main(String[] args) {
        CreditCard c=new CreditCard();
        c.setCardNumber(1234567890123456L);
        c.setPinNumber(1234);
        System.out.println(c.getCardNumber());
        System.out.println(c.getPinNumber());


    }
}
