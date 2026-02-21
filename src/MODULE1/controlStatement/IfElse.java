package MODULE1.controlStatement;

public class IfElse {
    public static void main(String[] args) {

        if(true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


        int a=11;
        if(a==10){
            System.out.println("a=10");
        }
        else {
            System.out.println("a!=10");
        }

//even or odd number program
        int n=23;
        if(n%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }


//program for age

int age =25;
        if (age>=18){
            System.out.println("major");
        }
        else{
            System.out.println("minor");
        }
//money withdrawal

        double accBal=10000.0;
        int amt=1000;
        if(accBal>amt) {
            System.out.println("withdrawal sucessfull");
        }
        else{
            System.out.println("not sucessfull");

        }
    }
}
