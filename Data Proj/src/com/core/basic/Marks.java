package com.core.basic;

public class Marks {
	
	public double[][] generateMarksSheet(int[][] marks){
		int count=marks[0].length;
		double[][] fullMarks=new double[marks.length][marks[0].length+2];
		for(int i=0;i<marks.length;i++){
			int total=0;
			for(int j=0;j<marks[0].length;j++){
				fullMarks[i][j]=marks[i][j];
				total+=marks[i][j];
			}
			fullMarks[i][count]=total;
			fullMarks[i][count+1]=(double)total/count;
		}
		return fullMarks;
	}
	
	public void display(double[][] marks){
		for(double[] d:marks){
			for(double e:d){
				System.out.print(e+"\t");
			}
			System.out.println();
		}
	}

}
