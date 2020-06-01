package com.sapient.week4;

import java.util.Arrays;

public class Int_Arr_Process {
	int arr[];

	public Int_Arr_Process() {
		arr = new int[10];
	}

	public Int_Arr_Process(int n) {
		arr = new int[n];
	}

	public Int_Arr_Process(int arr[]) {
		this.arr = arr;
	}

	public Int_Arr_Process(Int_Arr_Process obj) {
		this.arr = obj.arr;
	}

	public void readArr() {
		System.out.println("Enter " + arr.length + " numbers : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Read.br.nextInt();
		}
	}

	public void displayHorizontal() {
		System.out.println("Horizontal representation of array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void displayVertical() {
		System.out.println("Vertical representation of array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	public void sortArr() {
		Arrays.sort(arr);
	}

	public int biggestElem() {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (ans < arr[i]) {
				ans = arr[i];
			}
		}
		return ans;
	}

	public int smallestElem() {
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (ans > arr[i]) {
				ans = arr[i];
			}
		}
		return ans;
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
