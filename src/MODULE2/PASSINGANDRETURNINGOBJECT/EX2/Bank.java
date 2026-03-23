package MODULE2.PASSINGANDRETURNINGOBJECT.EX2;

import java.util.Scanner;

public class Bank {
    static void displayAccountInfo(Account a){
        if(a!=null){
            System.out.println("Account number="+a.accNumber);
            System.out.println("Account Balance="+a.accBal);
        }
    }
    static Account createAccount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number :");
        long accNumber=sc.nextLong();
        System.out.println("Enter Account Balance :");
        double accBal=sc.nextDouble();
        return new Account(accNumber,accBal);
    }
}
