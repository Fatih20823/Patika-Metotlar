package com.main;

import java.util.Scanner;

public class Application {
	static int method(int y,int a) {
		if(a<=0) {
			return y;
		}
		
		System.out.println(y);
		return method(y+5,a-1);
	}
	static int pattern(int x) {		
		if(x<=0) {
			
			return x;
			
		}
		System.out.println(x);
		return pattern(x-5);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pozitif bir Sayi Giriniz: ");
		int s = scan.nextInt();
		int a = s%5;
		
		if(a>=1) {
			a = s/5+1;
		}else {
			a = s/5;
		}
		
		int c = pattern(s);
	    System.out.println(method(c,a));
		
	}

}
