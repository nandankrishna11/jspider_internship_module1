package MODULE1.ARRAYS.PROBLEMS;

public class EvenNumbers {
    public static void main(String[] args) {
        int arr[]={15,12,14,13,17,16};
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0)//for odd numbers if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
