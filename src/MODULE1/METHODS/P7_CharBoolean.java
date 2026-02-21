package MODULE1.METHODS;
//passing char and boolean
public class P7_CharBoolean {
    static  void run(boolean bool){
        System.out.println("value "+ bool);
    }

    static void help(char ch){
        System.out.println("values :"+ch);
        run(true);
    }

    public static void main(String[] args) {
        help('N');
    }
}
