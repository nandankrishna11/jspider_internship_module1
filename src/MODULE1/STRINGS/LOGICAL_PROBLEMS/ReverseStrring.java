package MODULE1.STRINGS.LOGICAL_PROBLEMS;

public class ReverseStrring {
    public static void main(String[] args) {
        String str="Tiger";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
