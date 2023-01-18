package com.main;


public class Application {	

	public static void main(String[] args) {
		
		int[][] a = {{2,3,4},
					{5,6,4}};
		int[][] aT =new int[a[0].length][a.length];
			
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				         aT[col][row]=a[row][col];
			}			
		}

		for (int i =0 ; i < aT.length ; i++){
            for (int j = 0; j <  aT[i].length; j++) {
                System.out.print(aT[i][j] + "     ");
            }
            System.out.println();
        }
	}	
}

