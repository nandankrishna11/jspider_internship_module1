package MODULE1.ARRAYS.PROBLEMS;



//brute force approach
public class Searching {
    public static void main(String[] args) {
        int[] arr={14,13,10,12,16,15,13,18};
        int element=14;
        boolean present =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println(element+" found at index "+i);
                present=true;
            }
        }
        if(present==false){
            System.out.println(element+" not found ");
        }

    }
}

/*
output
 int element=10;
 10 found at index 2

  int element=13;
  13 found at index 1
13 found at index 6


int element=20;
20 not found


 */