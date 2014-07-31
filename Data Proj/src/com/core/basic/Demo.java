package com.core.basic;

public class Demo {

	public static void main(String[] args) {
		Marks marks=new Marks();
		int[][] marksArray={{52,60,55,67,70,62},{65,68,73,68,84,77},{69,63,74,77,66,59}};
		double[][] marksList=marks.generateMarksSheet(marksArray);
		marks.display(marksList);
	}

}
