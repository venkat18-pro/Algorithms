package com.sort.java;

import java.util.Random;

public class BubbleSort {

	static void sort(int[] arr) {
		int length = arr.length-1;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static void printArray(int[] arr){
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[10];
		for(int i=0; i<arr.length;i++) {
			arr[i] = ran.nextInt(100);
		}
		sort(arr);
		System.out.println("Sorted Array: ");
		printArray(arr);
	}

}
