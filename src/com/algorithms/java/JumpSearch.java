package com.algorithms.java;

public class JumpSearch {

	public static int jumpSearch(int[] arr, int x) {
		int length = arr.length - 1;
		int start = 0;
		int jump = (int) Math.floor(Math.sqrt(length));
		
		while(arr[length] >= x && arr[start] <= x) {
			
			while(arr[start] >= x){
				if(x == arr[start])
					return start;
				start--;
			}
			
			start += jump;
		}	
		return -1;
	}
	
	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		int x = 0;
		int result = jumpSearch(arr, x);
		
		if(result == -1)
			System.out.println("Element not presend.");
		else
			System.out.println("Element find the index: " + result);
		
	}

}
