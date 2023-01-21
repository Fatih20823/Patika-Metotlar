package com.thread;

public class Banka {
    private int bakiye;

	public Banka() {
		
	}
	public Banka(int bakiye) {
		
		this.bakiye = bakiye;
	}
	
	 public synchronized void paraCek(String isim,int tutar) {
		 
		 if (tutar>bakiye) {
			 System.out.println(isim+" Bakiye yetersiz");
		 }else if (tutar<bakiye) {
			 bakiye =bakiye-tutar;
			 System.out.println(isim+" Kalan bakiye: " + bakiye);
		 }
	 }
    
}
