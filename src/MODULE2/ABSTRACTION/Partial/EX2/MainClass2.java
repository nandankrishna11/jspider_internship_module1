package MODULE2.ABSTRACTION.Partial.EX2;


// abstract class can run without any abstract method


abstract class Delta{
    void help(){
        System.out.println("Executing help");
    }
    void verify(){
        System.out.println("executing verify");
    }
}
class Example extends Delta{

}
public class MainClass2 {
    public static void main(String[] args) {
        Delta d=new Example();
        d.help();
        d.verify();
    }
}
