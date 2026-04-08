package MODULE2.singletonClass;

import MODULE2.singletonClass.enthusiasticInitializtion.Sample;
import MODULE2.singletonClass.lazyInitialization.Connection;

public class MainClass {
    public static void main(String[] args) {
        Connection c1=Connection.getConnection();
        Connection c2=Connection.getConnection();
        Connection c3=Connection.getConnection();
        Connection c4=Connection.getConnection();
        Connection c5=Connection.getConnection();


        Sample s1=Sample.getSample();
        Sample s2=Sample.getSample();
        Sample s3=Sample.getSample();
        Sample s4=Sample.getSample();
        Sample s5=Sample.getSample();

    }
}
