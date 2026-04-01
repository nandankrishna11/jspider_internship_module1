package MODULE2.overriding.whatapp;


class Whatsapp1{
    void readReceipt(){
        System.out.println("sent");
    }
}

class Whatsapp2 extends Whatsapp1{
    @Override
    void readReceipt(){
        System.out.println("sent ,delivered");
    }
}

class Whatsapp3 extends Whatsapp2{
    @Override
    void readReceipt(){
        System.out.println("sent,delivered,seen");
    }

}
public class WhatsappUpdate {
    public static void main(String[] args) {a
        Whatsapp1 w1=new Whatsapp1();
        w1.readReceipt();
        Whatsapp1 w2=new Whatsapp2();
        w2.readReceipt();
        Whatsapp1 w3=new Whatsapp3();
        w2.readReceipt();
        Whatsapp1 w4=new Whatsapp3();
        w4.readReceipt();

    }
}
