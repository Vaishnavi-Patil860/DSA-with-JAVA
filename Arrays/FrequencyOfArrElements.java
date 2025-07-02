package Array.Array;

import java.util.*;

public class FrequencyOfArrElements {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,2,4,1,1,2,1,3,1,3,5,6};
        boolean [] b = new boolean[arr.length];
        System.out.println(Arrays.toString(arr));
        for(int i =0; i<arr.length; i++){
             if(b[i]) continue;
             int cnt = 1;
               for(int j = i + 1; j<arr.length; j++) {
                 if(arr[i] == arr[j] && !b[j] ){
                    cnt++;
                    b[j] = true;
                }
            }
                System.out.println(arr[i] + " : " + cnt);
        } 
    }
} 
    

