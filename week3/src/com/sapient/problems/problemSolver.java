package com.sapient.problems;

public class problemSolver {

	public static void main(String[] args) {

//		System.out.println(Integer.parseInt(args[0]));
		Command_Line1 obj = new Command_Line1();
		obj.setData(args);
		obj.calData();
		obj.displayData();
		
		
		KeyRead_Line2 obj2 = new KeyRead_Line2();
		obj2.readInput();
		obj2.display();
		obj2.sort();
		obj2.display();
		obj2.find(12);
	}

}
