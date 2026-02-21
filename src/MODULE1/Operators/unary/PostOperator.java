package MODULE1.Operators.unary;

public class PostOperator {
    public static void main(String[] args) {
        //post operator
        int a=5;
        System.out.println("a=5,post increment=" + a++);
        System.out.println("actual a="+a);

        int b=9;
        System.out.println("b=9,post decrement=" + b--);
        System.out.println("actual b="+b);




        int x=17;
        System.out.println("post increment");
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(x++);
        System.out.println("");

int y=17;
        System.out.println("post decrement");
        System.out.println(y--);
        System.out.println(y--);
        System.out.println(y--);
        System.out.println(y--);
        System.out.println(" ");
int w=10,v=5;
        System.out.println("w="+w);
        System.out.println("v="+v);
        System.out.print("after post operation w++ + v++ =");
        System.out.println(w++ + v++ );
        System.out.println("w="+w);
        System.out.println("v="+v);


        int e=25,f=22;

        System.out.println(e++ + f++ - e-- - f--); //25+22-26-23
        System.out.println(e++ + f++ - e-- - f-- +e++ - f--); //25+22-26-23 + 25 -22
    }
}
