package com.thread;

public class MainThread {

	public static void main(String[] args) {
		 Banka b = new Banka(900);
		 
		 parayatır a1 = new parayatır(b,"fatih", 400);
		 parayatır a2 = new parayatır(b, "zeynep",600);

		 a1.start();
		 a2.start();
	}
	
	static class parayatır extends Thread{
		private Banka b;
		private String isim;
		private int tutar;
		public parayatır(Banka b, String isim, int tutar) {
			
			this.b = b;
			this.isim = isim;
			this.tutar = tutar;
		}
		
		@Override
		public void run() {
			
			try {
				Thread.sleep(100);
				b.paraCek(isim, tutar);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
