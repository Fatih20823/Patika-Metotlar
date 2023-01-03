package com.main;

import java.util.Scanner;

public class Application {
	
	public static int a,b;
	
	public static int Uslu(int b) {
		
		int result=0;
		
			if(b==0 || b==-1) {
				result = 1;
			}
			else if (a==0) {
				return result = 0;
			}
			else {
			return result =Uslu(b-1)*a;
			}		
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Taban degeri giriniz :");
		a = scan.nextInt();
		System.out.println("Us degeri giriniz :");
		b = scan.nextInt();

		System.out.println(Uslu(b));

	}

}
