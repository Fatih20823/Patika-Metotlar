package com.main;

public class Application {
	
	static boolean isFind(int[] arr,int value) {
		
		for(int i : arr) {
			
			if(i==value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
    
		int[] list = {1,2,3,4,2,6,2,8,9,10,6,12,14,11,7,5,4,7,3,5,12,10};
		int[] dublicate = new int[list.length];
		int temp=0;
		for (int i = 0; i < list.length-1; i++) {
			for (int j = i+1; j < list.length; j++) {
				
				if(list[i]==list[j] && list[i]%2==0) {
					
					if(!isFind(dublicate, list[i])) {
							dublicate[temp++]=list[i];
					}
				}			
			}
		}
		for (int i : dublicate) {
			System.out.println(i);
		}
  }
}
