package MODULE2.JAVABEANCLASS;

public class MainClass {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(25);
        System.out.println("Age: "+p.getAge());
        p.setHeight(175);
        System.out.println("Height: "+p.getHeight());
        p.setWeight(70);
        System.out.println("Weight: "+p.getWeight());
    }
}
