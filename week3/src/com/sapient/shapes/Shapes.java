package com.sapient.shapes;

public class Shapes {

	public static void main(String[] args) {

		
		calculateShapeArea(3, 12);
		System.out.println("--------------------------------------------------------------------");
		calculateShapeArea(4, 15);
		System.out.println("--------------------------------------------------------------------");
		calculateShapeArea(5, 15);
		System.out.println("--------------------------------------------------------------------");
		
		
	}
	
	public static void calculateShapeArea(int numOfSides, int sides)
	{
		if (numOfSides==1) {
			Circle.calculateArea(sides);
		}
		else if (numOfSides==3) {
			Triangle.calculateArea(sides);
		}
		else if (numOfSides==4) {
			Square.calculateArea(sides);
		}
		else {
			System.out.println("No shape is present");
		}	
	}
}
