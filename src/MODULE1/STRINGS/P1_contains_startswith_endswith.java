package MODULE1.STRINGS;

public class P1_contains_startswith_endswith {
    public static void main(String[] args) {
        String str="Engineering";
        System.out.println(str.contains("job"));//false
        System.out.println(str.contains("gin"));//true
        System.out.println(str.startsWith("eng"));//false
        System.out.println(str.startsWith("Engine"));//true
        System.out.println(str.endsWith(" ing"));//false
        System.out.println(str.endsWith("ring"));//true
    }


}
