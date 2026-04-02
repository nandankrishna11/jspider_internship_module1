package MODULE2.POLYMORPHISM.COMPILETIME.IRCTC;

public class Irctc {
    void search(String source,String destination){
        System.out.println("Searching for trains from "+source+" to "+destination);
    }
     void search(String trainName){
        System.out.println("Searching for train "+trainName);
    }
     void search(int trainNumber){
        System.out.println("Searching for train with number "+trainNumber);
    }
}
