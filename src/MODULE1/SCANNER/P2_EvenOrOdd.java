package MODULE1.SCANNER;

//Program to print a number is even or odd
import java.util.Scanner;// reduce using import java.util.*;
public class P2_EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//System.in is a reference to keyboard
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("number is even number");

        }
        else {
            System.out.println("number is odd number");
        }
    }
}
