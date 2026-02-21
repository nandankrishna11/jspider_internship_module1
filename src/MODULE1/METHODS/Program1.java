package MODULE1.METHODS;

public class Program1 {
    static void test(){
        System.out.println("Executing text()....");
    }

    public static void main(String[] args) {
        System.out.println("Program starts");
        test();//test() method calling
        play();//play() method calling
        play();//play() method calling
        play();//play() method calling

        System.out.println("Program ends");


    }

   public static void play(){
        System.out.println("Executing play()....");
    }
}
