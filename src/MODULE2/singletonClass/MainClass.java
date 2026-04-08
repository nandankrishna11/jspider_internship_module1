package MODULE2.singletonClass;

import MODULE2.singletonClass.lazyInitialization.Connection;

public class MainClass {
    public static void main(String[] args) {
        Connection c1=Connection.getConnection();
        Connection c2=Connection.getConnection();
        Connection c3=Connection.getConnection();
        Connection c4=Connection.getConnection();
        Connection c5=Connection.getConnection();

    }
}
