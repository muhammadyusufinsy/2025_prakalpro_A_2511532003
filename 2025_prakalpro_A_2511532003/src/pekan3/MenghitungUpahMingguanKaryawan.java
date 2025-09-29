package pekan3;

import java.util.Scanner;

public class MenghitungUpahMingguanKaryawan {
	public static void main(String [] args) {
		String nama;
		int upahKaryawan = 0;
		char golongan;
		int jamKerja;
		int gajiPokok;
		int bonus = 0;
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Nama Karyawan = ");
		nama = keyboard.next();
		System.out.println("Golongan Karyawan = ");
		golongan = keyboard.next().charAt(0);
		System.out.println("Jumlah Jam Kerja = ");
		jamKerja = keyboard.nextInt();
		keyboard.close();
		
		
		if (golongan == 'A' ) {
			upahKaryawan = 1000;
		}else if (golongan == 'B' ) {
			upahKaryawan = 2000;
		}else if (golongan == 'C' ) {
			upahKaryawan = 3000;
		}else if (golongan == 'D' ) {
			upahKaryawan = 4000;
		}
		

		
		if (jamKerja > 60) {
			int jamBonus = jamKerja - 60;
			bonus = jamBonus * 5000;
		}
		if (golongan == 'A') {
			gajiPokok = (jamKerja * 1000) + bonus;
		}else if (golongan == 'B') {
			gajiPokok = (jamKerja * 2000) + bonus;
		}else if (golongan == 'C') {
			gajiPokok = (jamKerja * 3000) + bonus;
		}else if (golongan == 'D') {
			gajiPokok = (jamKerja * 4000) + bonus;
		}else {
			gajiPokok = 0;
		}

		System.out.println("gaji mingguan " + nama + " adalah " + gajiPokok);
		System.out.println("upah per jam " + nama + " adalah " + upahKaryawan);
	}
}

