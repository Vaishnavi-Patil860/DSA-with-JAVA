package array;

public class PringArrayUsingForLoop {
    
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6,7,8,9};

        //forward tracing
           for(int i=0; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
           }
        System.out.println();
        //backward tracing
           for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    
    }
 }
