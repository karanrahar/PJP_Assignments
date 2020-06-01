package com.sapient.week4;

public class Matrix {
	int mat[][];
	public Matrix() {
		mat = new int[3][3];
	}
	public Matrix(int row,int col) {
		mat = new int[row][col];
		
	}
	public Matrix(int mat[][]) {
		this.mat = mat;
	}
	public Matrix(Matrix obj) {
		this.mat = obj.mat;
	}
	
	public int[][] getMat() {
		return mat;
	}
	public void setMat(int[][] mat) {
		this.mat = mat;
	}
	public void readMat() {
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print("Enter "+mat[i].length+" numbers for row "+(i+1)+" : ");
			for (int j = 0; j < mat[i].length; j++) {
//				System.out.print(mat[i][j]);
				mat[i][j] = Read.br.nextInt();
			}
			System.out.println();
		}
	}
	
	public void displayMat() {
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public Matrix addMat(Matrix m) {
		int sum[][], mat1[][] = m.getMat();
		sum = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sum[i][j] = mat[i][j] + mat1[i][j];
			}
		}
		Matrix ans = new Matrix(sum);
		return ans;
	}
	public boolean isScalar()
	{
		boolean ans=true;
		int num = mat[0][0];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i==j && mat[i][j]!=num) {
					ans = false;
				}
				else if(mat[i][j]!=0) {
					ans = false;
				}
			}
		}
		return ans;
	}
	public Matrix mulMat(Matrix m) {
		int mul[][], mat1[][] = m.getMat();
		mul = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				for (int k = 0; k < mat[0].length; k++) {
					mul[i][j] += mat[i][k]*mat1[k][j];
				}
			}
		}
		Matrix ans = new Matrix(mul);
		return ans;
	}

}
