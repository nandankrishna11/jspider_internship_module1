package MODULE2.JAVABEANCLASS.ex2;

public class MainClass {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setEid(123);
        System.out.println("Employee ID: "+e.getEid());
        e.setCtc(4.5);
        System.out.println("Employee CTC: "+e.getCtc());
    }
}
