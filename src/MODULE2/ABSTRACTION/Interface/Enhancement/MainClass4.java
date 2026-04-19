package MODULE2.ABSTRACTION.Interface.Enhancement;
// In Java 8, we can have default and static methods in interfaces.
// Default methods are instance methods with a default implementation. They can be overridden by implementing classes.

interface Alpha{
    void disp();
    default void help(){
        System.out.println("Default method in interface");
    }
}
class Example implements Alpha{
    @Override
    public void disp() {
        System.out.println("Executing disp");
    }
}
public class MainClass4 {
    public static void main(String[] args) {
        Alpha a=new Example();
        a.disp();
        a.help();
    }
}
