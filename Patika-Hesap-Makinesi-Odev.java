package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int select;
		String menu = "1- Collection Process\n"
				+ "2- Extraction Process\n"
				+ "3- The Multiplication\n"
				+ "4- Division\n"
				+ "5- Exponential Number Calculation\n"
				+ "6- Factorial Calculation\n"
				+ "7- Modding\n"
				+ "8- Rectangular Area and Perimeter Calculation\n"
				+ "0- Logout";
			
		do {
			System.out.println(menu);
			System.out.print("Please select an action :");
			select = input.nextInt();
			switch (select) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				modding();
				break;
			case 8:
				rectangleAndEnvironment();
				break;
			default:
				break;
			}
		}while(select !=0);
        input.close();
	}

	private static void rectangleAndEnvironment() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st edge :");
		int a = input.nextInt();
		System.out.println("Enter the 2nd edge :");
		int b = input.nextInt();
		
		if(a == 0 || b == 0) {
			System.out.println("Edge cannot be zero !");
		}
		System.out.println("Circumference of rectangle :"+(a*b)+"\nThe area of the strutge :"+(2*(a+b)));
	}

	private static void modding() {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers to enter :");
		int counter = input.nextInt();
		int number,result = 0;
		
		for (int i = 1; i <= counter; i++ ) {
			number = input.nextInt();
			if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor 0!");
                continue;
            }
			if (i == 1) {
                result = number;
                continue;
            }
            result %= number;
		}
		System.out.println("Result : " + result);
		
	}

	private static void factorial() {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
		
	}

	private static void power() {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter base value :");
        int base = input.nextInt();
        System.out.print("Enter an exponent value :");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
		
	}

	private static void divided() {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers to enter :");
		int counter = input.nextInt();
		double number,result = 0;
		
		for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor 0!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
		
	}

	private static void times() {
		Scanner input = new Scanner(System.in);
		int number,result = 1, i = 1;
		
		while (true) {
			System.out.println(i++ + ". number :");
			number = input.nextInt();
			
			if (number == 1)
				break;
			if (number == 0) {
				result = 0;
				break;
			}
			result *= number;
		}
		System.out.println("Result : " + result);
	}

	private static void minus() {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers to enter :");
		int counter = input.nextInt();
		int number,result=0;
		
		for(int i=1;i <= counter; i++) {
			System.out.println(i + ". number :");
			number = input.nextInt();
			if (i == 1) {
				result += number;
				continue;
			}
			result -= number;
		}
		System.out.println("Result : " + result);
		
	}

	private static void plus() {	
		Scanner input = new Scanner(System.in);
		int number,result = 0, i = 1;
		
		while(true) {
			System.out.println(i++ + ". number :");
			number = input.nextInt();
			 if(number == 0) {
				 break;
			 }
			 result += number;
		}
		System.out.println("Result : " + result);
	}
}
