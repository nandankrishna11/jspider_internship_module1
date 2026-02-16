package controlStatement.PatternProblem;

public class AlphaPattern {
    public static void main(String[] args) {
/*
        q1)
* * * * *
*       *
* * * * *
*       *
*       *
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0||i==n/2||j==0||j==n-1)
                {
                    System.out.print("*"+" ");
                }
                else    {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }


        q2)B



        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0||i==n/2||i==n-1||j==0||j==n/2||j==n-1)
                {
                    System.out.print("*"+" ");


                }
                else    {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

        q3) C


        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0||i==n-1||j==0)
                {
                    System.out.print("*"+" ");


                }
                else    {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

Q)F


        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0||j==0||i==n/2)
                {
                    System.out.print("*"+" ");


                }
                else    {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

Q)G


        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0||j==0||i==n-1&&j<=n/2||j==n/2&&i>=n/2||i==n/2&&j>=n/2||j==n-1&&i>=n/2)
                {
                    System.out.print("*"+" ");


                }
                else    {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }


Q) H



        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(j==0||i==n/2||j==n-1)
                {
                    System.out.print("*"+" ");


                }
                else    {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }


Q) I


        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0||j==n/2||i==n-1)
                {
                    System.out.print("*"+" ");


                }
                else    {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

Q) J


        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==n-1||j==n-1||j==0&&i>=n/2)
                {
                    System.out.print("*"+" ");


                }
                else    {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }



  Q) K





                int n = 7;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        if (j == 0 || i + j == n / 2 || i - j == n / 2) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }

                    }
                    System.out.println();
                }

   Q) L


        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j == 0 ||i==n-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


Q) M


        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j ==0  ||j==n-1||i==j&&i<=n/2||i+j==n-1&&j>=n/2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
 Q) N



        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j ==0  ||j==n-1||i==j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        Q) O

        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j ==0  ||j==n-1||i==0||i==n-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


        Q) P


        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((j == 0 ||
                        (j == n - 1 && i <= n / 2) ||
                        i == 0 ||
                        i == n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        q) Q



        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j ==0  ||j==n-1||i==0||i==n-1||i==j&&j>=n/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        Q) R

        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((j == 0 ||
                        (j == n - 1 && i <= n / 2) ||
                        i == 0 ||
                        i == n / 2)||i==j&&j>=n/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        Q) S

        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j==0&&i<=n/2||i==0||i==n/2||i==n-1||j==n-1&&i>=n/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        Q) T



        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i==0||j==n/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


        Q) U


        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j==0||j==n-1||i==n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

 Q) V

                int n = 7;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 2 * n; j++) {

                        if (j == i || j == 2 * n - 2 - i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
            }
        }
  Q) W






                int n = 7;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        if (j == 0 ||
                                j == n - 1 ||
                                (i >= n / 2 && (i == j || i + j == n - 1)))
                        {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }


     Q) X


                int n = 7;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        if (i == j || i + j == n - 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }

    Q) Y



                int n = 7;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        if ((i <= n / 2 && (i == j || i + j == n - 1)) ||
                                (i > n / 2 && j == n / 2))
                        {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();

                }


Q) Z

        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 ||
                        i == n - 1 ||
                        i + j == n - 1)
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

 */


    }
}