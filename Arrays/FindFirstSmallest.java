package Array.Array;

public class FindFirstSmallest {
    public static void main(String[] args) {
        int [] arr = {2,5,23,5,7,2};
        int smallest = arr[0];
        for(int ele : arr){
            if(smallest > ele)
             smallest = ele;
        }
        System.out.println(smallest);
    }
}

