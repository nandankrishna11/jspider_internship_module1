package MODULE1.Operators.unary;

public class PreOperator {
    public static void main(String[] args) {
        System.out.println("pre increment");
        int a=4;
        System.out.println(++a);//5
        System.out.println(a);//5
        System.out.println(" pre decrement");
        int b=8;

        System.out.println(--b);//7
        System.out.println(b);//7


        System.out.println("pre increment");
        int x=13;
        System.out.println(++x);//14
        System.out.println(++x);//15
        System.out.println(++x);//16

        System.out.println(" pre decrement");
        int y=19;
        System.out.println(--y);//18
        System.out.println(--y);//17
        System.out.println(--y);//16


        int p=17;
        System.out.println(++p + ++p); //37

        int r=17;
        System.out.println(--r +--r); //31

        System.out.println(" ");
        int m=10;
        System.out.println(++m - ++m - --m - --m); //11-12-11-10


        int e=11;
        int f=15;
        int g= ++e + --f + ++e + --f ;
        System.out.println(g);

    int h=10;
        System.out.println(a++ + ++a);

        int i =15;
        System.out.println(--i + i--);
    }
}
