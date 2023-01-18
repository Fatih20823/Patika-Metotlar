package com.main;

import java.util.Arrays;

public class Application {	

	public static void main(String[] args) {
		int temp;
		
		int[] dizi = {10,20,20,10,10,20,5,20,30,40,30,40,30,40,10,0,0,0,0,0,0,0,0};
		Arrays.sort(dizi);
		for (int i = 0; i < dizi.length-1; i++) {
			temp=0;
			for (int j = i; j < dizi.length; j++) {
				
				if(dizi[i]==dizi[j]) {
					temp++;					
				}			
			}
			if(i==0 && dizi[i+1]==dizi[i]) {
				System.out.println(dizi[i]+" sayısı "+temp+" kere tekrar edildi.");
			}
			if (i==0 && dizi[i+1]!=dizi[i]){
				System.out.println(dizi[i]+" sayısı "+temp+" kere tekrar edildi.");
			}			
			if(i!=0 && dizi[i-1]!=dizi[i]) {
				System.out.println(dizi[i]+" sayısı "+temp+" kere tekrar edildi.");
			}
		}
	}	
}
