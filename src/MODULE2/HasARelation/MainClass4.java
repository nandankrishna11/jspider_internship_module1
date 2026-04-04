package MODULE2.HasARelation;


class Engine{
    void start(){
        System.out.println("Engine is starting");
    }
}
class Driver{
    void drive(){
        System.out.println("Driver is driving");
    }
}
class Car{
    Engine e=new Engine();// Car Has A Engine : Composition
    Driver d;// Car Has A Driver : Aggregation
    Car(Driver d){
        this.d=d;
    }

}
public class MainClass4 {
    public static void main(String[] args) {
        Driver d = new Driver();
       Car c = new Car(d);
         c.d.drive();
         c.e.start();

    }
}
