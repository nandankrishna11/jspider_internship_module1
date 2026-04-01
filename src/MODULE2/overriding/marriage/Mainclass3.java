package MODULE2.overriding.marriage;
class  Mother{
    void marriage(){
        System.out.println("arranged marriage");
    }
}
class Daughter extends Mother{
    void marriage(){
        System.out.println("love marriage");
    }
    void drinking(){
        System.out.println("coffee/tea");
    }
}

public class Mainclass3 {
    public static void main(String[] args) {
        Mother m= new Mother();
        m.marriage();
        Daughter d=new Daughter();
        d.marriage();
        d.drinking();
        Mother ref=new Daughter();
        ref.marriage();
        //ref.drinking(); -> error mother cant access daughter property
    }
}
