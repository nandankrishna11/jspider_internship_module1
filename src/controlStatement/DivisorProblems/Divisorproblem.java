package controlStatement.DivisorProblems;
// a problem to find out the divisor of given number


public class Divisorproblem {
    public static void main(String[] args) {
        int a=1;
        int num=48;
        int b=num/2;
        while(a<=b){
            if(num%a==0){
                System.out.println(a);
            }
            a++;
        }
    }
}
