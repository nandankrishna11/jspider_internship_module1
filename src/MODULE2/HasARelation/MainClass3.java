package MODULE2.HasARelation;
class Alpha{
    void help(){
            System.out.println("Executing help method of Alpha class");
    }
}

class Beta{
    void assist(){
        System.out.println("Executing assist method of Beta class");
    }
}
class Gamma{
    Alpha a=new Alpha();//composition
    Beta b;//aggregation
    Gamma(Beta b){
        this.b=b;
    }
}
public class MainClass3 {
    public static void main(String[] args) {
        Beta b1=new Beta();
        Gamma g1=new Gamma(b1);
        g1.a.help();
        g1.b.assist();
    }
}
