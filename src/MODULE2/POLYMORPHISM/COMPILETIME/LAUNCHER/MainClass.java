package MODULE2.POLYMORPHISM.COMPILETIME.LAUNCHER;

public class MainClass {
    public static void main(String[] args) {
        Launcher l=new Launcher();
        l.launch();
        l.launch("MyApp");
        l.launch("MyApp","1.0");
        l.launch("MyApp","1.0","Windows");
        l.launch("MyApp","1.0","Windows","Nandan");
    }
}
