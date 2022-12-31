package com.main;

import java.util.Scanner;

public class Application {
	
	static boolean isPalindrom(int number) {		
		
		int temp=number,reverseNumber=0,lastNumber;
		
		while(temp !=0 ) {
			lastNumber = temp%10;
			reverseNumber = (reverseNumber*10)+lastNumber;
			System.out.println(temp);
			temp/=10;
			System.out.println(temp);
		}
		
		if(reverseNumber == number){
			return true;
		}else {		
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int n = scan.nextInt();
		System.out.println(isPalindrom(n));

	}

}
