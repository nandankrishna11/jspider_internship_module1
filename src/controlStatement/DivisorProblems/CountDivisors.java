package controlStatement.DivisorProblems;
//java program to count number of divisors
public class CountDivisors {
    public static void main(String[] args) {
        int a=1;
        int num=12;
        int b=num/2;
        int count=0;
        while(a<=b){
            if(num%a==0){

                count++;
            }
            a++;
        }
        System.out.println("count:"+count);
    }
}
