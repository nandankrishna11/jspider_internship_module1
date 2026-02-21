package MODULE1.METHODS;
// passing values
public class P6_PassingArgument {
    static  void test1(int a)//formal argument
    {
        System.out.println("values:"+a);
    }
    static void test2(double d){
        System.out.println("value:"+d);
    }
    static void test3(float f){
        System.out.println("value:"+f);
    }

    static void test3(long l){
        System.out.println("value:"+l);
    }

    public static void main(String[] args) {
        test1(25);//actual argument
        test2(2.3);
        test2(3.5);
        test2(7.999);

        test3(7.2f);
        test3(2234567890234567890L);
    }


}
