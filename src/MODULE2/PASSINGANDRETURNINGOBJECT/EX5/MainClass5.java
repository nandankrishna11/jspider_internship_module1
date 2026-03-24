package MODULE2.PASSINGANDRETURNINGOBJECT.EX5;

import MODULE2.PASSINGANDRETURNINGOBJECT.EX4.Helper;

public class MainClass5 {
    public static void main(String[] args) {
        Biriyani b1=Hotel.cookBiriyani();
        Hotel.showBiriyani(b1);
        System.out.println(" ");
        Biriyani b2=Hotel.cookBiriyani();
        Hotel.showBiriyani(b2);
    }
}
