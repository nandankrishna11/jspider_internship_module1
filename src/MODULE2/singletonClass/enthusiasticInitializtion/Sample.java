package MODULE2.singletonClass.enthusiasticInitializtion;

public class Sample {
    private Sample() {
        System.out.println("Creating object of Sample class");
    }

    private static Sample ref = new Sample();

    public static Sample getSample() {
        if (ref == null) {
            ref = new Sample();
        }
        return ref;
    }
}
