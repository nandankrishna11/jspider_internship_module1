package MODULE2.PASSINGANDRETURNINGOBJECT.EX5;


import java.util.Scanner;

public class Hotel {
    static void showBiriyani(Biriyani b){
        if(b!=null){
            System.out.println("Quantity="+b.qty);
            System.out.println("Price="+b.price);
        }
    }
    static Biriyani cookBiriyani(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the quantity");
        int qty=sc.nextInt();
        System.out.println("enter the price");
        double price=sc.nextDouble();
        return new Biriyani(qty,price);
    }
}
