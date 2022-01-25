package com.sort.java;

import java.util.Random;

public class SelectionSort {

	  static void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	        {
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;
	
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	
	public static void printArray(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] k = new int[10];
		for(int i =0;i<10;i++) {
			k[i] = ran.nextInt(100);
		}
		sort(k);
		System.out.println("Sort Array..");
		printArray(k);
	}

}
