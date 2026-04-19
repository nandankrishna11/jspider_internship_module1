package MODULE2.ABSTRACTION.Interface.Enhancement;
// static method in interface
// Java 8 onwards, we can have static methods in interfaces. These methods belong to the interface and can be called without creating an instance of the interface. Static methods in interfaces are useful for providing utility methods that are related to the interface but do not require an instance to be invoked.
interface Demo {
    static void test(){
        System.out.println("Executing static method in interface");
    }

}
public class MainCLass3 {
    public static void main(String[] args) {
        Demo.test();
    }
}
