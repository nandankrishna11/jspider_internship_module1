package MODULE2.overriding.facebook;
class FacebookOld{
    void reaction(){
        System.out.println("only like ");
    }
}
class FacebookNew extends FacebookOld{
    void reaction(){
        System.out.println("like,wow,laugh,love,sad,angry");
    }
}
public class FacebookMain {
    public static void main(String[] args) {
        FacebookOld f1=new FacebookOld();
        f1.reaction();
        FacebookNew f2=new FacebookNew();
        f2.reaction();
        FacebookOld f3=new FacebookNew();
        f3.reaction();
    }
}
