package Array.Array;

public class FindFirstLargest {
    public static void main(String[] args) {
        int [] arr = {2,5,23,5,7,2};
        int largest = arr[0];
        for(int ele : arr){
            if(largest < ele)
             largest = ele;
        }
        System.out.println(largest);
    }
}
