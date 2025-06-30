package array;

import java.util.Arrays;

public class SeparateNegPosNo {
    public static void main(String[] args) {
        
    
     int arr[] = {1,-4,5,-6,8,-7};
       for(int i=0;i<arr.length; i++){
         if(arr[i] > 0){
            for(int j=i+1; j< arr.length; j++){
                if(arr[j] < 0){
                   int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
         }
      }
      System.out.println(Arrays.toString(arr));
    }
}
