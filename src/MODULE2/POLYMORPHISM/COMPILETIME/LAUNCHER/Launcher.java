package MODULE2.POLYMORPHISM.COMPILETIME.LAUNCHER;

public class Launcher {
    void launch(){
        System.out.println("Launching the application");
    }
     void launch(String appName){
        System.out.println("Launching the application "+appName);
    }
     void launch(String appName,String version){
        System.out.println("Launching the application "+appName+" version "+version);
    }
     void launch(String appName,String version,String platform){
        System.out.println("Launching the application "+appName+" version "+version+" on platform "+platform);
    }
     void launch(String appName,String version,String platform,String user){
        System.out.println("Launching the application "+appName+" version "+version+" on platform "+platform+" for user "+user);
    }
}
