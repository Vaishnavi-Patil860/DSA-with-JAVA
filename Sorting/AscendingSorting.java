package BubbleSort;
import java.util.Arrays;

class AscendingSorting{
	public static void main(String[] args) {
		int [] arr = {1,4,6,7,4,3,8,2,6,8,3,6,9,2,6,9,13,166,17,18};

		for(int i =0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
			System.out.println(Arrays.toString(arr));

    }
}
