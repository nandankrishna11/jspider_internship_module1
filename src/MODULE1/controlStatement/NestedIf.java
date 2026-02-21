package MODULE1.controlStatement;

public class NestedIf {
    public static void main(String[] args) {

        //withdrawal problem
       /* double accBal=10000.0;
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

        */
//age eligibility

        int age=25;
        char ch='M';
        if(ch=='M'){
            if(age>21){
                System.out.println("eligible to marriage");
            }
            else {
                System.out.println("not eligible for marriage");
            }
        }
        else if(ch=='F'){
            if(age>=18){
                System.out.println("eligible spinster");
            }
            else{
                System.out.println("girl underage");
            }
        }
        else{
            System.out.println("invalid gender");
        }
    }

}
