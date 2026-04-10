package MODULE2.ABSTRACTION.Partial.EX4;

public class MainClass {
    public static void main(String[] args) {
        Alto a=new Alto();
        CarSimulator.simulator(a);

        Innova b = new Innova();
        CarSimulator.simulator(b);
    }
}
