package METHODS;

public class P5_FuncInFunc {
    static void test(){
        System.out.println("test starts");
        System.out.println("test ends");
    }
    static void disp(){
        System.out.println("display start");
        test();
        System.out.println("display ends");
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        disp();
        System.out.println("main ends");
    }
}
