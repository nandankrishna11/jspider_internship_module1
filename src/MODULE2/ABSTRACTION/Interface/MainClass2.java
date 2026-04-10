package MODULE2.ABSTRACTION.Interface;


interface Delta{
    void disp();
    void help();
}
class Example implements Delta{
    @Override
    public void disp() {
        System.out.println("Executing disp");
    }

    @Override
    public void help() {
        System.out.println("Executing help");
    }
}
public class MainClass2 {
    public static void main(String[] args) {
        Delta d=new Example();
        d.disp();
        d.help();
    }
}
