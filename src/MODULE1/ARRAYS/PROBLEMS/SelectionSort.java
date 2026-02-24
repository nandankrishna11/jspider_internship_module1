package MODULE1.ARRAYS.PROBLEMS;
//inbuilt method
//java.util.Arrays.sort(arr); or Arrays.sort(arr)

public class SelectionSort {
   static void display(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        public static void main (String[]args){
            int[] arr = {14, 12, 15, 18, 16};
            System.out.println("before sorting");
            display(arr);
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j])//(arr[i] < arr[j]) descending
                    {

                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;


                    }
                }
            }
            System.out.println("after sorting");
            display(arr);



        }
}
