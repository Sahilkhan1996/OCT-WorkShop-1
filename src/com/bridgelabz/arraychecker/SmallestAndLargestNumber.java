package com.bridgelabz.arraychecker;
//Problem:I/P:{1,2,3,4,5,6,7}

//O/P:SmallestNumber:1, LargestNumber:7

import java.util.Scanner;

public class SmallestAndLargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of values you would like to enter the array");
		int arrlength = sc.nextInt();
		int[] arr = new int[arrlength];
		int k = 0;
		while (k < arrlength) {
			System.out.println("Enter the " + (k + 1) + " value: ");
			arr[k] = sc.nextInt();
			k++;
		}
		// Checking the Largest Value from array
		int max = 0;
		// Iterating all the values array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)// checking if the array element is greater than 0
			{
				max = arr[i]; // if find greater number then storing the value in maximum variable
				// max=2
			}
		}
		System.out.println("Largest Number is: " + max);

		// Checking the smallest element from array

		int min = arr[0];
		// Iterating all the values from array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)// checking if the array element is less than first values of array
			{
				min = arr[i]; // if found minimum values then storing in value in min variable
			}
		}
		System.out.println("Smallest Number is: " + min);
		sc.close();
	}
}
