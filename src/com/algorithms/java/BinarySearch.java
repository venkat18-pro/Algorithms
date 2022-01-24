package com.algorithms.java;

import java.util.Scanner;

public class BinarySearch {

	public int  binarySearch(int []arr, int start, int length, int x) {
		
		if(length >= start) {
			int mid = (start + length) / 2;
			
			if(arr[mid] == x)
				return mid;
			
			if(arr[mid] > x)
				return binarySearch(arr, start, mid - 1, x);
			
			return binarySearch(arr, mid + 1, length, x);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		BinarySearch bin = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		int [] arr = {1, 3, 4, 10, 40};
		int len = arr.length;
		int x = sc.nextInt();
		
		int result = bin.binarySearch(arr, 0, len - 1, x);
		
		if(result == -1)
			System.out.println("Element is not presend");
		else
			System.out.println("Element fount at Indix: "+result);
		sc.close();
	}
	
}
