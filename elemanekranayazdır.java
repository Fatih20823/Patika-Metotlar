package com.ElemanYaz;

import java.util.Scanner;

public class ElemanYazdırma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Satır da görüntülenecek eleman sayısını giriniz?");
		int k = scan.nextInt();
		int [] dizi = new int[] {10,32,23,17,40,20,86,65,76,19,20,23,34,45,56};
		for (int i=0;i<dizi.length;i++) {
			System.out.print(dizi[i]+" ");
			
			if ((i+1)%k==0) {
				System.out.printf("\n\n");
			}
		}
		int kalan = dizi.length%k;
		kalan = k-kalan;
		if (kalan==k) kalan=0;
		for (int i = 0; i < kalan; i++) {
			System.out.print("00 ");
		}

	}

}
