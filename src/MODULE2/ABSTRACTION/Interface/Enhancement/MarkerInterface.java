package MODULE2.ABSTRACTION.Interface.Enhancement;
// Marker interface is an interface which does not have any method. It is used to mark a class as having some property or behavior. For example, Serializable is a marker interface that indicates that a class can be serialized. Similarly, Cloneable is a marker interface that indicates that a class can be cloned. Marker interfaces are used to provide metadata about a class and can be used by the Java runtime to perform certain operations on the class.
// Example of a marker interface
interface Serializable {
    // no methods
}
class Employee implements Serializable {
    private String name;
    private int id;
}
public class MarkerInterface {
    public static void main(String[] args) {
        Employee emp = new Employee();
        // emp can be serialized because it implements Serializable interface
    }
}
