package MODULE2.CONSTRUCTOR;
/* You have been asked to develop a solution to create multiple ticket counter.
Each ticket counter should have counter_name
no_of_ticket to be sold and ticket officwer name .
Analyze and build the solution using relevent concepts*/


class Ticket_counter {
    int counterNo;
    int noOfTickets;
    String officerName;
    Ticket_counter(int counterNo, int noOfTickets, String officerName){
        this.counterNo=counterNo;
        this.noOfTickets=noOfTickets;
        this.officerName=officerName;

    }
   void display(){
        System.out.println("Counter number= "+counterNo );
        System.out.println("Number of tickets= "+noOfTickets);
        System.out.println("Officer name= "+officerName);
        System.out.println(" ");
    }
}
public class Solution{
    public static void main(String[] args) {
        Ticket_counter t1=new Ticket_counter(1,2,"nandan");
        t1.display();
        Ticket_counter t2=new Ticket_counter(2,2,"Raju");
        t2.display();
    }
}
