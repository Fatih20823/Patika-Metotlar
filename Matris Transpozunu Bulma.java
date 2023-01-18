package com.main;


public class Application {	

	public static void main(String[] args) {
		
		int[][] a = {{2,3,4},
					{5,6,4}};
		int[][] aT =new int[3][2];
			
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length+1; col++) {
				         aT[col][row]=a[row][col];
			}
			
		}

		for (int[] row : aT) {
			for (int col : row) {
				System.out.println(col);
			}
		}
	}	
}
