package MODULE2.ABSTRACTION.Partial.EX4;

public class CarSimulator {
    static void simulator(Car c){
        if(c!=null){
            c.drive();
            c.fuel();
            c.gear();
        }
    }
}
