package LogiacalProblems;
//java program to check n is divisible by 7 without using % operator
public class WithoutModulus {
    public static void main(String[] args) {
        int num=28;
        while(num>0){
            num=num-7;
        }
        if(num==0){
            System.out.println("divisible by 7");
        }
        else{
            System.out.println("not divisible by 7");
        }
    }
}
