package MODULE1.controlStatement.DivisorProblems;
// to print all perfect number between 0 and 100
public class PerfectNumber {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
          // int i = 28;//6,28 are perfect number
            int a = 1;
            int b = i / 2;
            int sum = 0;
            while (a <= b) {
                if (i % a == 0) {

                    sum = sum + a;
                }
                a++;
            }
            if (sum == i) {
                System.out.println(i+"perfect number");
            } else {
                System.out.println(i+"not a perfect number");
            }
        }
    }
}