package MODULE2.JAVABEANCLASS.ex4;

public class MAinCLass {
    public static void main(String[] args) {
        Credentials c=new Credentials();
        c.setUsername("admin");
        c.setPassword("admin123");
        System.out.println("Username: "+c.getUsername());
        System.out.println("Password: "+c.getPassword());
    }
}
