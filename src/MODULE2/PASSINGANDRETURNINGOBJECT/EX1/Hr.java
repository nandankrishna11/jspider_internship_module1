package MODULE2.PASSINGANDRETURNINGOBJECT.EX1;

import java.util.Scanner;

public class Hr {
    static void displayEmployeeDetails(Employee e){
        if(e!=null){
            System.out.println("EID="+e.id);
            System.out.println("CTC="+e.ctc);
        }
    }
    static Employee createEmployee(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter id");
        int id=sc.nextInt();
        System.out.println("Enter CTC");
        Double ctc=sc.nextDouble();
        return new Employee(id,ctc);
    }
}
