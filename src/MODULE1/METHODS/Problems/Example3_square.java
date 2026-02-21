package MODULE1.METHODS.Problems;
/* square() method should accept an integer value n as argument

calculate square of given n value

return square value to caller
 */
public class Example3_square {
    static  int square(int n){
        int sq=n*n;
        return sq;
    }

    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.println(i+" square="+square(i));
        }
    }
}
