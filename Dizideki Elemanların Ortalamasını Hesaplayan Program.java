package com.main;


public class Application {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
        double sum = 0;
        int temp =0;
        for (int i = 0; i < numbers.length; i++) {
        	for(double k=1; k<=numbers[temp]; k++) {
        		
        		sum = sum+(1/k);
        	}
            temp++;
        }

        System.out.println(sum / numbers.length);
        
		
	}

}
