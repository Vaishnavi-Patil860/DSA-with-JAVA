package array;

import java.util.Arrays;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8};

        for(int i = 0; i< arr.length; i++){
            if(arr[i] % 2 == 0){
                for(int j = i+1; j<arr.length;j++ ){
                    if(arr[j] % 2 != 0){
                          int temp = arr[j];
                          for (int k = j; k>i ;k--)
                               arr[k] = arr[k-1];
                               arr[i] = temp;
                               break;
                           }
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    

