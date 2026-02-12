package operators.bitwise;

//bitwose operator -&,|,^

public class Bitwise {
    public static void main(String[] args) {
        //swaping a number using XOR operator
        /*int a= 10;
        int b=5;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);*/


        int x=45;//101101
        int y=27;//011011
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);
    }
}
