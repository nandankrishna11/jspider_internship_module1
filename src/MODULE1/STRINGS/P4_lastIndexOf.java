package MODULE1.STRINGS;

public class P4_lastIndexOf {
    public static void main(String[] args) {
        String str="Karnataka";
        System.out.println(str.lastIndexOf('t'));//5
        System.out.println(str.lastIndexOf('r'));//2
        System.out.println(str.lastIndexOf('h'));//-1

        int p= str.lastIndexOf('a');//8
        int q= str.lastIndexOf('a',p-1);//6
        int r= str.lastIndexOf('a',q-1);//4
        int s= str.lastIndexOf('a',r-1);//1
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }
}
