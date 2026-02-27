package MODULE1.STRINGS.LOGICAL_PROBLEMS;

public class Palindrome {


        public static void main(String[] args) {
            String str="Malayalam";
            String rev="";
            for(int i=str.length()-1;i>=0;i--){
                rev=rev+str.charAt(i);
            }
            if(str.equalsIgnoreCase(rev)) {
                System.out.println("string is palindrome");
            }
            else {
                System.out.println("strings not palindrome");
            }
        }
    }


