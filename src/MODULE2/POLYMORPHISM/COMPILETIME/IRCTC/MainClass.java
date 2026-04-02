package MODULE2.POLYMORPHISM.COMPILETIME.IRCTC;

public class MainClass {
    public static void main(String[] args) {
        Irctc i=new Irctc();
        i.search(12345);
        i.search("Delhi","Mumbai");
        i.search("Rajdhani Express");
    }
}
