package com.algorithms.java;

public class LinearSearch {

	public static int linearSearch(int[] arr, int start,int x) {
		int length = arr.length-1;
		int i;
			for(i=0; i<=length; i++) {
				if(arr[i] == x) 
					return i;
			}	
			return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arrs = {1,2,4,13,16};
		int x = 20;
		int result = linearSearch(arrs, 0, x);
		
		if(result == -1) 
			System.out.println("Element not present.");
		else
			System.out.println("Element find the Index: "+result);
	}

}
