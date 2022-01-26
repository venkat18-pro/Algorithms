package com.sort.java;

public class QuickSort {

	public static void quickSort(int[] arr,int lowIndex,int highIndex) {
		if(lowIndex >= highIndex)
			return;
		
		int pivot = arr[highIndex]; 
		int left = lowIndex; 
		int right = highIndex;
		
		while(left < right) { 
			while(arr[left] <= pivot && left < right ) {
				left++;
			}  
			while(arr[right] >= pivot && left < right) {
				right--;
			}
			swap(arr, left, right);
		}
		swap(arr, left, highIndex);
		
		quickSort(arr, lowIndex, left -1);
		quickSort(arr, left + 1, highIndex);
	}
	
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	} 
	
	public static void printArray(int[] arr) {
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = {11,32,3,4,10};
		System.out.println("Sorted Array:");
		quickSort(arr, 0, arr.length -1);
		
		printArray(arr);

	}

}
