package METHODS;
//returning value in multiple datatype

//void=return nothing
public class P10_ReturningValue {

    //int type
    static int test(){
        return 10;
    }

    //double type
    static double test2() {
        return 3234567.8;
    }

    //float type
    static float test3() {
        return 3234567.8f;
    }

    //char type
    static char test4() {
        return 'n';
    }

    //string type
    static String test5() {
        return "nandan";
    }

    //boolean type
    static boolean test6() {
        return true;
    }



    public static void main(String[] args) {
        //int type
        int val =test();
        System.out.println("value="+val);

        System.out.println("value="+test());

//double type
        double val2 =test2();
        System.out.println("value="+val2);

        System.out.println("value="+test2());
//float type
        float val3 =test3();
        System.out.println("value="+val3);

        System.out.println("value="+test3());
//char type
        char val4 =test4();
        System.out.println("value="+val4);//value=110.0 is it double or any other datatype

        System.out.println("value="+test4());

//string type
        String val5 =test5();
        System.out.println("value="+val5);

        System.out.println("value="+test5());

//boolean type
        boolean val6 =test6();
        System.out.println("value="+val6);

        System.out.println("value="+test6());
    }
}
