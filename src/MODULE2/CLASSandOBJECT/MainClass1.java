package MODULE2.CLASSandOBJECT;



class Pen{
    String brand;
    String colour;
    double price;
}
public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Pen p1=new Pen();
        p1.brand="cello";
        p1.colour="red";
        p1.price=25.00;
        System.out.println("brand="+p1.brand);
        System.out.println("colour="+p1.colour);
        System.out.println("price="+p1.price);


        Pen p2=new Pen();
        p2.brand="Reynolds";
        p2.colour="black";
        p2.price=15.00;
        System.out.println("brand="+p2.brand);
        System.out.println("colour="+p2.colour);
        System.out.println("price="+p2.price);

        System.out.println("main method ended");

    }
}
