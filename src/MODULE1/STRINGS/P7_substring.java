package MODULE1.STRINGS;

public class P7_substring {
    public static void main(String[] args) {
        String str="Developer";
        System.out.println(str.substring(6));
        System.out.println(str.substring(4));
        System.out.println(str.substring(3,8));
        System.out.println(str.substring(0,7));
        //System.out.println(str.substring(12)); Exception checkBoundsBeginEnd
    }
}
