package MODULE1.METHODS.Problems;
/*
verify() method shjould take an ingteger value as argumen

check if given argument is even or odd

return true if it is even ,return false if it is odd
 */

public class Example1_verify {
    static boolean verify(int n){
        if(n%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("status :"+verify(10));
        System.out.println("status :"+verify(15));
    }
}
