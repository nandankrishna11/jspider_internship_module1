package MODULE1.METHODS;

public class P4_conditionInMethod {
    static void verify(){
        System.out.println("executing verify()....");
        int a=10;
        if(a%2==0){
            for(int x=1;x<=5;x++) {
                System.out.println("java");
            }
            System.out.println("stop verify()...");
        }
    }

    public static void main(String[] args) {
        System.out.println("Execution start....");
        verify();
        System.out.println("Execution stop......");
    }
}
