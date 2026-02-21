package MODULE1.controlStatement;

public class switchstatement {
    public static void main(String[] args) {
      //problem 1
        int cho=2;

        switch(cho){
            case 1 :
                System.out.println("cod");
                break;
            case 2:
                System.out.println("UPI");
                break;
            case 3:
                System.out.println("card");
                break;
            case 4:
                System.out.println("net banking");
                break;
            default :
                System.out.println("wrong choice");

        }

      // probelm 2


        int ch=2;
        switch(ch){
            case 1 :
                System.out.println("withdrawal");
                break;
            case 2:
                System.out.println("balance enquiry");
                break;
            case 3:
                System.out.println("pin change");
                break;
            case 4:
                System.out.println("mini statement");
                break;
            default :
                System.out.println("wrong choice");

        }
//problem 3

        int choice=3;
        switch(choice){
            case 1 :
                System.out.println("excellent");
                break;
            case 2:
                System.out.println("good");
                break;
            case 3:
                System.out.println("average");
                break;
            case 4:
                System.out.println("poor");
                break;
            default :
                System.out.println("skip");
        }


        //problem 4

        char choicee ='a';
        switch (choicee){
            case 'A' :
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Ball");
                break;
            case 'C':
                System.out.println("cat");
                break;
            case 'D':
                System.out.println("Door");
                break;
            default :
                System.out.println("under development");

        }
    }

}
