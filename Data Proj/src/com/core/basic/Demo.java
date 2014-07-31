package com.core.basic;

public class Demo {

	public static void main(String[] args) {
		Marks marks=new Marks();
		int[][] marksArray={{50,60,55,67,70,62},{62,65,70,70,81,74},{72,66,77,80,69,62}};
		double[][] marksList=marks.generateMarksSheet(marksArray);
		marks.display(marksList);
	}

}
