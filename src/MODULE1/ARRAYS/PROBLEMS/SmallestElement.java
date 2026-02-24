package MODULE1.ARRAYS.PROBLEMS;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr ={14,12,17,16,19,15};
        int small=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("smallest element ="+small);
    }
}
