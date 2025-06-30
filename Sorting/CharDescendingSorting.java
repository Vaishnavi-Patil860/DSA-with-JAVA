package Sorting;

import java.util.*;

class CharDescendingSorting{
	public static void main(String[] args) {
		String [] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
		"Q","R","S","T","U","V","W","X","Y","Z"};

      System.out.println(Arrays.toString(arr));
      sortAscending(arr,arr.length);
      System.out.println("Descending order:");
      System.out.println(Arrays.toString(arr));}

      public static void sortAscending(String [] arr, int len){
      	for(int i = 0; i <arr.length; i++){
      		      	for(int j = i+1; j < arr.length; j++){
      		      		if(arr[i].compareTo(arr[j])<0){	
      		      			String temp = arr[i];
      		      			arr[i] = arr[j];
                            arr[j] = temp;
      		      		     }

      	                }
     
                 }
            }      
     }
    



