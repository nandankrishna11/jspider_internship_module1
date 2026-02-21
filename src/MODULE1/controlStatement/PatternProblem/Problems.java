package MODULE1.controlStatement.PatternProblem;

public class Problems {
    public static void main(String[] args) {
        // to print 1 0 1 0 1

        /*int n = 5;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("1" + " ");
            } else {
                System.out.print("0" + " ");
            }
        }
    }
    // a b a b


        int m = 5;
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                System.out.print('a' + " ");
            } else {
                System.out.print('b' + " ");
            }
        }


// 1* 2* 3
        int m = 5;
        int val =1;
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                System.out.print(val + " ");
                val++;
            } else {
                System.out.print("*" + " ");
            }
        }

        // a* b* c
        int m = 5;
        char val='a';
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                System.out.print(val + " ");
                val++;
            } else {
                System.out.print("*" + " ");
            }
        }
*/

        //1 2 3 2 1

        int n=10;
        int val=1;
        for(int i=0;i<n;i++){
            if(i<n/2){
                System.out.print( val++ +" ");

            }
            else
            {
                System.out.print(val-- +" ");
            }

        }
    }


}

