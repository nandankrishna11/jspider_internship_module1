package controlStatement.DivisorProblems;

//java program to find sum of all divisors

public class SumofDivisors {
    public static void main(String[] args) {
        int a=1;
        int num=15;
        int b=num/2;
        int sum=0;
        while(a<=b){
            if(num%a==0){

                sum=sum +a;
            }
            a++;
        }
        System.out.println("sum:"+sum);
    }
}

