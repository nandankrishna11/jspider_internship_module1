package MODULE2.ABSTRACTION.Partial.EX3;

public class MainClass {
    public static void main(String[] args) {
        Samsung s=new Samsung();
        AndroidEmulator.emulator(s);

        Vivo v = new Vivo();
        AndroidEmulator.emulator(v);

        Oppo o=new Oppo();
        AndroidEmulator.emulator(o);
    }
}
