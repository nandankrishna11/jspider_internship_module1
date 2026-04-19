package MODULE2.ABSTRACTION.Interface.Enhancement;
// A functional interface is an interface that contains only one abstract method. It can have multiple default and static methods, but it must have exactly one abstract method. Functional interfaces are used as the basis for lambda expressions and method references in Java.
// The @FunctionalInterface annotation is used to indicate that an interface is intended to be a functional interface. This annotation is not required, but it helps to ensure that the interface is used correctly and can be used by the compiler to generate errors if the interface does not meet the requirements of a functional interface.
// Example of a functional interface
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(); // This is the single abstract method
public class FunctionalInterface {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface func = () -> System.out.println("Hello, World!");
        func.myMethod(); // Output: Hello, World!
    }
}
}
