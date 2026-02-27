package MODULE1.STRINGS;

public class P2_toCharArray {
    public static void main(String[] args) {
        String str="Tiger";
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }

        System.out.println(" or ");

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
