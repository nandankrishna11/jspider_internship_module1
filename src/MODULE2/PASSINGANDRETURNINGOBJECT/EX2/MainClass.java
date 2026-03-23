package MODULE2.PASSINGANDRETURNINGOBJECT.EX2;

public class MainClass {
    public static void main(String[] args) {
        Account a1;
        a1=Bank.createAccount();
        Bank.displayAccountInfo(a1);
        System.out.println("------------------------");
        Account a2;
        a2=Bank.createAccount();
        Bank.displayAccountInfo(a2);
        System.out.println("------------------------");
    }
}
