package Sorting.Sorting.BubbleSort;
import java.util.Arrays;


public class SwapCount {

	public static void main(String[] args) {
		int [] arr = {4,3,1,2};
		int swapCnt = 0;


		for(int i =0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;

					swapCnt ++;
				System.out.println("swap" +":" +swapCnt);
			}
		}
	 }
			System.out.println(Arrays.toString(arr));

    }
}


