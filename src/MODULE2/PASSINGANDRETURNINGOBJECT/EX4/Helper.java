package MODULE2.PASSINGANDRETURNINGOBJECT.EX4;

import java.util.Scanner;

public class Helper {
    static void displayPersonDetails(Person p){
        if(p!=null){
            System.out.println("age="+p.age);
            System.out.println("height="+p.height);
            System.out.println("weight="+p.weight);
        }
    }

    static  Person createPersonDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        System.out.println("enter the height");
        double height=sc.nextDouble();
        System.out.println("enter the weight");
        double weight= sc.nextDouble();
        return new Person(age,height,weight);
    }
}
