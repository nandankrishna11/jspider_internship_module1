package MODULE1.SCANNER;
//program that uses multiple input datatype

import java.util.Scanner;
public class P4_MultipleDatatype {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your mobile number");
        long mobile=sc.nextLong();
        System.out.println("enter CTC");
        double ctc=sc.nextDouble();
        System.out.println("Are you single");
        boolean single =sc.nextBoolean();

        System.out.println("Mobil :"+mobile);
        System.out.println("CTC :"+ctc);
        System.out.println("Single :"+single);
    }
}
