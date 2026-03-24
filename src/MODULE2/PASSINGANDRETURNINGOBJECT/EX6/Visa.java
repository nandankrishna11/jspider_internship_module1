package MODULE2.PASSINGANDRETURNINGOBJECT.EX6;

import java.util.Scanner;

public class Visa {
    static void displayCardInfo(DebitCard dc){
        if(dc!=null){
            System.out.println("Card Number="+dc.cardNumber);
            System.out.println("Pin Number="+dc.pinNumber);
        }
    }
    static DebitCard issueDebitCard(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the card number");
        long cardNumber=sc.nextLong();
        System.out.println("enter the pin number");
        int pinNumber= sc.nextInt();
        return new DebitCard(cardNumber,pinNumber);
    }
}
