package MODULE2.singletonClass.lazyInitialization;

public class Connection {
    private Connection(){
        System.out.println("Connection is created");
    }
    private static Connection conn = null;
    public static Connection getConnection(){
        if(conn==null){
            conn = new Connection();
        }
        return conn;
    }

}
