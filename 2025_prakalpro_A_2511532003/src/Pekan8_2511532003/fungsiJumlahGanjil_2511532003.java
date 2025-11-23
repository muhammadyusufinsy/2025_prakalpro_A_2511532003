package Pekan8_2511532003;

import java.util.Scanner;

public class fungsiJumlahGanjil_2511532003 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("masukan angka =");
		int a = input.nextInt();
		
		int hasil = JumlahGanjil(a);
		System.out.println("hasil penjumlahan angka ganjil dari 1 sampai" + a + " adalah = " + hasil);
		input.close();
		
	}
	public static int JumlahGanjil (int n) {
		int i;
		int jumlah = 0;
		for (i=1;i<n;i++) {
			if ( i % 2 ==1) {
				jumlah = jumlah + i;
			}
			
		}return jumlah;
	}
	

}
