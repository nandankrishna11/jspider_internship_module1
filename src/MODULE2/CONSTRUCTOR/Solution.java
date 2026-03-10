package MODULE2.CONSTRUCTOR;
/* You have been asked to develop a solution to create multiple ticket counter.
Each ticket counter should have counter_name
no_of_ticket to be sold and ticket officer name.
Analyze and build the solution using relevant concepts
*/

//Enhancement-1 Add a method by name availableTickets() to display available tickets in the counter

/*Enhancement-2 Add a method by name buyTickets(),should accept N tickets to buy,
buy ticket should be success if the available ticket are sufficient
eg: if available ticket is 10
buying 5 tickets, success, available ticket = 5
buying 12 tickets, failed due to insufficient ticket inn counter
 */


import java.sql.SQLOutput;

class Ticket_counter {
    int counterNo;
    int noOfTickets;
    String officerName;
    Ticket_counter(int counterNo, int noOfTickets, String officerName){
        this.counterNo=counterNo;
        this.noOfTickets=noOfTickets;
        this.officerName=officerName;

    }
   void details(){
        System.out.println("Counter number= "+counterNo );
        System.out.println("Number of tickets= "+noOfTickets);
        System.out.println("Officer name= "+officerName);
        System.out.println(" ");
    }

    void availableTickets(){
        this.noOfTickets+=noOfTickets;
        System.out.println("Available tickets ="+noOfTickets);
    }

    void buyTickets(int n){
        if (noOfTickets>n){
            System.out.println("success");
        }
        else {
            System.out.println("available ticket should be less than "+noOfTickets);
        }
    }
}
public class Solution{
    public static void main(String[] args) {
        Ticket_counter t1=new Ticket_counter(1,2,"nandan");
        t1.details();
        Ticket_counter t2=new Ticket_counter(2,2,"Raju");
        t2.details();
        Ticket_counter t3=new Ticket_counter(1,3,"Mohan");
        t3.availableTickets();
        t3.buyTickets(5);
    }
}
