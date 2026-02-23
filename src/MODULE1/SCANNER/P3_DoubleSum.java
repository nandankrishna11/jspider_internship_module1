package MODULE1.SCANNER;
//Calculate sum of two numbers using double datatype
import java.util.Scanner;
public class P3_DoubleSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        double n1=sc.nextDouble();
        System.out.println("Enter the second number");
        double n2=sc.nextDouble();
        double sum=n1+n2;
        System.out.println("sum="+sum);
    }
}
