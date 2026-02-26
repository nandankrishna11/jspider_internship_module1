package MODULE1.ARRAYS.PROBLEMS;

public class AverageOfArray {
    public static void main(String[] args) {
        {
            int arr[]={12,10,13,14,15};
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
            }
            int average=sum/ arr.length;
            System.out.println("Average="+average);
        }
    }
}
