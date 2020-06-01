package com.sapient.week4;

public class Runner {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		Int_Arr_Process intobj = new Int_Arr_Process(arr);
		
//		intobj.readArr();
		intobj.displayHorizontal();
		intobj.displayVertical();
		intobj.sortArr();
		intobj.displayHorizontal();
		System.out.println(intobj.biggestElem());
		System.out.println(intobj.smallestElem());
		System.out.println(intobj.sum());
		
		System.out.println("------------------------------------------------------------------");
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		Matrix matobj = new Matrix(mat);
		
//		matobj.readMat();
		matobj.displayMat();
		System.out.println(matobj.isScalar());
		matobj.addMat(matobj).displayMat();
		matobj.mulMat(matobj).displayMat();	
		
		
		
	}

}
