package MODULE1.STRINGS;

public class P8_split {
    public static void main(String[] args) {
        String str="Qspider Jspider Pyspider Prospider";
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(" ");
        String[] arr1=str.split("id");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr1[i]);
        }

    }
}
