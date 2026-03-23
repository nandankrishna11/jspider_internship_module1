package MODULE2.PASSINGANDRETURNINGOBJECT.EX3;

import java.util.Scanner;

public class Cricket {
    static void displayPlayerDetail(Player p){
        if(p!=null){
            System.out.println("Player jersey number:"+p.jerseyNumber);
            System.out.println("Player Name:"+p.name);
        }
    }
    static Player createPlayer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Jersey Number:");
        int jerseyNumber=sc.nextInt();
        System.out.println("Enter Name:");
        String name=sc.next();
        return new Player(jerseyNumber,name);
    }
}
