package controlStatement.DivisorProblems;
// a prime number will be having only two divisor (1 and number itself) if between 0 and num /2 ,
// the count of divisors is 1 ,then the number is prime
public class PrimeNumber {
    public static void main(String[] args) {
    int a=1;
    int num=13;

    int count=0;
    while(a<=num/2){
        if(num%a==0){

            count++;
        }
        a++;
    }
    if(count==1){
        System.out.println(num+":number is prime");
    }
    else{
        System.out.println(num+":number is not prime");
    }
}
}
