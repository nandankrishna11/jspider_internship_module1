package MODULE1.SCANNER;

import java.util.Scanner;

public class P5_Character_trick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character value");
        char ch = sc.next().charAt(0);//we are reading string and extracting the first character from string
        System.out.println("value:" + ch);
    }
}