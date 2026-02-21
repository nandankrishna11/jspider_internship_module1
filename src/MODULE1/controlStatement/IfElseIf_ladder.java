package MODULE1.controlStatement;

public class IfElseIf_ladder {
    public static void main(String[] args) {
        int a=5;
        if(a==5)
        {
            System.out.println("a is equal to 5");
        } else if (a>5) {
            System.out.println("a is greater than 5");
        }
        else if (a<5) {
            System.out.println("a is less than 5");
        }
        else{
            System.out.println("wrong choice");
        }


 /* program should display if number is divisible by 2 and 3 as bangalore,
    if number is divisible by 2 display chennai ,
    if njjumber is divisible by 3 then hyderabad ,else goa
    */


        int num =6;
        if (num %2==0 && num %3==0){
            System.out.println("bangalore");
        } else if ( num %2==0) {
            System.out.println("chennai");

        } else if (num %3==0) {
            System.out.println("hyderabad");

        }
        else{
            System.out.println( "goa");
        }

        // based on age ,decide whether full ticket, half ticket or free

        int age=7;
        if(age<=3)
        {
            System.out.println("free");
        } else if (age>3 && age<=10) {
            System.out.println("half ticket");
        }
        else if (age >10 && age<=60) {
            System.out.println("full ticket");
        }
        else{
            System.out.println("senior citizen ");
        }

//upper case or lower case
     char ch='n';
        if(ch>='A' && ch<='Z'){
            System.out.println("upper case");
        } else if (ch>='a'&& ch<='z') {
            System.out.println("lower case");

        }
        else if(ch >='0' && ch<='9'){
            System.out.println("numbers");
        }
        else {
            System.out.println("wrong choice");
        }

    // depending on marks decide first class, distinction,second class, fail
        float percentage=80;
        if(percentage>90){
            System.out.println("distinction");
        } else if (percentage>=80 && percentage<=90) {
            System.out.println("first class");

        } else if (percentage>=70 && percentage<=80) {
            System.out.println("second class");

        } else if (percentage >=60 && percentage<=50) {
            System.out.println("pass");

        }
        else {
            System.out.println("fail");
        }
    }

    public static class DoWhileLoop {
        public static void main(String[] args) {
         /*

     Q1)
          int a=1;
            do{
                System.out.println(a+":java");
                a++;
            }
            while   (a<=5);
     o/p :
            1:java
            2:java
            3:java
            4:java
            5:java


     Q2)
            int a=7;
            do{
                System.out.println(a+":java");
                a++;
            }
            while   (a<=5);

    o/p: 7:java



    Q)





            int x=5;
            do{
                System.out.println(x+":java");
                x--;
            }while(x>=1);


      o/p:
            5:java
            4:java
            3:java
            2:java
            1:java



          */
        }
    }
}
