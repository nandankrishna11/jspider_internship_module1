package controlStatement.PatternProblem;

public class SquarePattern {
    public static void main(String[] args) {
    /* Q1) To print-
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *

        int n=5; // size of square
        for(int i=0;i<n;i++)// NO OF ROWS
        {

            for(int j=0;j<n;j++) // NO OF COLUMNS
            {

                System.out.print("*"+" ");
            }
            System.out.println(); // NEXT LINE
        }

      */

/*
 Q2) to print-
 1 1 1 1 1
 2 2 2 2 2
 3 3 3 3 3
 4 4 4 4 4
 5 5 5 5 5

  int n=5;
 int val =1;
 for(int i=0;i<n;i++){
     for(int j=0;j<n;j++)
     {
         System.out.print(val+" "); //can also use i+1 instead of i

     }
     val++;
     System.out.println();
 }

Q3) to print

        a a a a a
        b b b b b
        c c c c c
        d d d d d
        e e e e e

        int n=5;
        char ch ='a';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print(ch+" ");

            }
            ch++;
            System.out.println();
        }


Q4) to print -
        5 5 5 5 5
        4 4 4 4 4
        3 3 3 3 3
        2 2 2 2 2
        1 1 1 1 1

        int n=5;
        int val =5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print(val+" ");

            }
            val--;
            System.out.println();
        }

Q5) to print -

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

        int n=5;
        int val =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {

                System.out.print(val +" ");
                val++;

            }
            val=1; if it is not used answer will be
            1 2 3 4 5
            6 7 8 9 10
            11 12 13 14 15
            16 17 18 19 20
            21 22 23 24 25

            System.out.println();
         }



        Q6)
        a b c d e
        a b c d e
        a b c d e
        a b c d e
        a b c d e

        int n=5;
        char val ='a';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {

                System.out.print(val +" ");
                val++;

            }
            val='a';
            System.out.println();
        }



        Q7)

        5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1

        int n=5;
        int val=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {

                System.out.print(val +" ");
                val--;

            }
            val=5;
            System.out.println();
        }

Q8)
1 1 1 1 1
0 0 0 0 0
1 1 1 1 1
0 0 0 0 0
1 1 1 1 1



int n=5;
for (int i=0;i<n;i++)
{
    for(int j=0;j<n;j++){
        if (i%2==0){
            System.out.print("1"+" ");
        }
        else {
            System.out.print("0"+" ");
        }

    }
    System.out.println();
}

Q9)

1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1


        int n=5;
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if (j%2==0){
                    System.out.print("1"+" ");
                }
                else {
                    System.out.print("0"+" ");
                }

            }
            System.out.println();
        }




Q10)
                * * * * *
                * - - - *
                * - - - *
                * - - - *
                * * * * *

        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0||j==0||j==n-1||i==n-1)
                {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print("-"+" ");
                }
            }
            System.out.println();
        }





        Q11)

* * * * *
*       *
*       *
*       *
* * * * *



        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0||j==0||j==n-1||i==n-1)
                {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
 Q12)

* * * * *
*   *   *
* * * * *
*   *   *
* * * * *

    int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0||j==0||j==n-1||i==n-1||i==n/2||j==n/2)
                {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

Q13)

principle diagonal

        int n=7;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j)
                {
                    System.out.print(" "+" ");
                }
                else {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }


Q14) secondary diagonal


        int n=7;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i+j==n-1)
                {
                    System.out.print(" "+" ");
                }
                else {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }



Q15)

*           *
  *       *
    *   *
      *
    *   *
  *       *
*           *

        int n=7;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j ||j+i==n-1)
                {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }



      Q16)

 * * * * * * *
  *       *
    *   *
      *
    *   *
  *       *
* * * * * * *


        int n=7;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0||i==n-1||i==j ||j+i==n-1)
                {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }



q17)

*   *   *
  * * *
* * * * *
  * * *
*   *   *

        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j||j==n/2||i==n/2||i+j==n-1)
                {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }


q18)
  * * *
*   *   *
* *   * *
*   *   *
  * * *
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j ||j+i==n-1)
                {
                    System.out.print(" "+" ");
                }
                else {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }


 */
    }
}
