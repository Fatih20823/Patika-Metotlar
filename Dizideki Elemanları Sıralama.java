package com.main;
import java.util.Arrays;
import java.util.Scanner;

public class Application {	

	public static void main(String[] args) {
		int boyut;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dizinin boyutunu giriniz: ");
		boyut = scan.nextInt();
		
		int[] arr = new int[boyut];
		
		System.out.println("Elemanlarını giriniz: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
			
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+". Elemanı: "+arr[i]);
			
		}
		
	}	
}
