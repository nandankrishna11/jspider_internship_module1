package MODULE1.METHODS.Problems;

/*
additon() method should accept 2 arguments

find sum of given 2 numbers

return sum value to caller
 */


public class Example2_addition {
    static double addition(double a,double b){
        double sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum="+addition(12,13));
        System.out.println("sum="+addition(2.3,3.2));
        System.out.println("sum="+addition(10,2.5));
        System.out.println("sum="+addition(3.2,10));
        System.out.println("sum="+addition(5,6));
    }

}
