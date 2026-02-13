package controlStatement;

public class NestedIf {
    public static void main(String[] args) {
        double accBal=10000.0;
        int amt=130;
        if(amt<=accBal )
        {
            if(amt %100==0) {
                System.out.println("withdrawal success");
            }
            else{
                System.out.println("invalid denomination");
            }

        }

        else{
            System.out.println("insuffecient bal");
        }

    }

}
