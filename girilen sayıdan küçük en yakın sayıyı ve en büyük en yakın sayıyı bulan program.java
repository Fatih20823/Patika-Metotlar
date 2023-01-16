package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
    
		 int[] list = {56, 34, 1, 8, 101, -2, -33};
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Bir sayi giriniz");
		 int sayi= scan.nextInt();
		 int min = list[0];
		 int minBuyuk = 0;
		 int max = list[0];
		 int maxBuyuk = 0;
		 

		 for (int i : list) {
			 if (i < min) {
				 min = i;							
			 }
			 if (i > max) {
				 max = i;
			 }
		 }
	
		 for (int i : list) {
			if(i<sayi) {
				 minBuyuk=i;
				 if(min<minBuyuk) {
					min=minBuyuk; 
				 }
			}		
		}
		 for (int i : list) {
			if(i>sayi) {
				maxBuyuk=i;
				if(max>maxBuyuk) {
					max=maxBuyuk;
				}
			}
		}

		 System.out.println("Girilen sayıdan küçük en yakın sayı " + min);
		 System.out.println("Girilen sayıdan büyük en yakın sayı " + max);

	}

}
