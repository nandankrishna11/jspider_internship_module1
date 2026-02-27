package MODULE1.STRINGS;

public class P3_indexOf {
    public static void main(String[] args) {
        String str="Karnataka";
        System.out.println(str.indexOf('t'));//5
        System.out.println(str.indexOf('r'));//2
        System.out.println(str.indexOf('h'));//-1

        int p= str.indexOf('a');//1
        int q= str.indexOf('a',p+1);//4
        int r= str.indexOf('a',q+1);//6
        int s= str.indexOf('a',r+1);//8
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }
}
