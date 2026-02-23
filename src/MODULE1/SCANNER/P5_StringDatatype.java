package MODULE1.SCANNER;
import java.util.Scanner;

// program to input string type elements

//this program won't work -only one string input is possible

/*sc.next() reads only a single word and leaves the newline (\n) in the input buffer,
while sc.nextLine() reads until it finds a newline —
so it immediately consumes that leftover newline and returns an empty string,
which is why they don’t work properly together without clearing the buffer.*/

public class P5_StringDatatype {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a  string");
        String str1=scn.next();// can output only single word at a time
        System.out.println("value="+str1);

        System.out.println("enter a  string");
        String str2=scn.nextLine();// can output multiple word at a time
        System.out.println("value="+str2);
    }
}
