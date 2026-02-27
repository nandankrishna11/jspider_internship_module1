package MODULE2.CLASSandOBJECT;

/*Represent Pen as an object
step1- identiy object/entity -Pen
step2-identify attribute
 */

import java.sql.SQLOutput;

class Pen{
    String brand;
    String colour;
    double price;
}

//Represent Textbook as Object

class TextBook{
    String tname;
    int tpages;
    double price;
    String author;

}

//Represent Laptop as object
class Laptop{
    String brand;
    double price;
    String procoessor;
}
public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println("Pens");
        System.out.println("1.pen");
        Pen p1=new Pen();
        p1.brand="cello";
        p1.colour="red";
        p1.price=25.00;
        System.out.println("brand="+p1.brand);
        System.out.println("colour="+p1.colour);
        System.out.println("price="+p1.price);
        System.out.println("2.Pen");
        Pen p2=new Pen();
        p2.brand="Reynolds";
        p2.colour="black";
        p2.price=15.00;
        System.out.println("brand="+p2.brand);
        System.out.println("colour="+p2.colour);
        System.out.println("price="+p2.price);
        System.out.println(" ");
        System.out.println("Textbooks");
        TextBook t1=new TextBook();
        System.out.println("Textbook-1");
        t1.author="Nandan Krishna";
        t1.tname="Introduction to Java";
        t1.tpages=120;
        t1.price=1200.0;
        System.out.println("Author name="+t1.author);
        System.out.println("Title ="+t1.tname);
        System.out.println("No of pages="+t1.tpages);
        System.out.println("Price ="+t1.price);
        System.out.println("Textbook-2");
        TextBook t2= new TextBook();
        t2.author="Daniel Amodei";
        t2.tname="claude code prompting";
        t2.tpages=370;
        t2.price=750.012;
        System.out.println("Author name="+t2.author);
        System.out.println("Title ="+t2.tname);
        System.out.println("No of pages="+t2.tpages);
        System.out.println("Price ="+t2.price);
        System.out.println(" ");
        System.out.println("Laptop Description");
        Laptop l1=new Laptop();
        l1.brand="Asus Vivobook";
        l1.price=67000.00;
        l1.procoessor="i5";
        System.out.println("Laptop Brand="+l1.brand);
        System.out.println("price="+l1.price);
        System.out.println("Processor type="+l1.procoessor);
        System.out.println("main method ended");

    }
}
