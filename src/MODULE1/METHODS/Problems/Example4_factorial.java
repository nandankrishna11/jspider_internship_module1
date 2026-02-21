package MODULE1.METHODS.Problems;
//factorial program

public class Example4_factorial {
    static int findFactorial(int n){
        int fact=1;
        while(n>=1){
            fact=fact*n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println(i+" factorial :"+findFactorial(i));
        }
    }
}
