package MODULE1.METHODS.Problems;
//prime number program
public class Example5_prime {

    static boolean isPrime(int num){
        int a=1;
        int count=0;
        while(a<=num/2) {
            if (num % a == 0) {
                count++;
            }
            a++;
        }
           if(count==1){
               return true;
           }
           else {
               return false;
           }

    }
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(isPrime(i)==true){
                System.out.println(i);
            }
        }
    }
}
