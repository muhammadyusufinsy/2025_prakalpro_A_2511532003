package pekan4;

import java.util.Scanner;

public class tugasAlproPekan4_2511532003 {
	public static void main (String [] args) {
		String namaPembeli;
		int jumlahTiket;
		int hargaDasar = 40000;
		int hargaHari = (0);
		String persenanHari;
		String namaHari;
		int hargaWaktu =(0);
		String persenanWaktu;
		int hargaJenis = (0);
		String hargaStudio;
		int hargaPerTiket;
		int hargaTotal;
		char hari = 'X';
		char waktuTayang = 'Y';
		String waktu;
		char jenisStudio = 'Z';
		String namaStudio;
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Nama pembeli : ");
		namaPembeli = keyboard.next();
		System.out.println("jumlah tiket : ");
		jumlahTiket = keyboard.nextInt();
		System.out.println("hari (s= senin-kamis, t= jumat, u=sabtu-minggu): ");
		hari = keyboard.next().charAt(0);
		System.out.println("waktu tayang (a= pagi, b= siang, c= malam : ");
		waktuTayang = keyboard.next().charAt(0);
		System.out.println("jenis studio (p= regular q= deluxe r= premium: ");
		jenisStudio = keyboard.next().charAt(0);
		
		if (hari == 's') {
			hargaHari =(10 * hargaDasar / 100);
		}else if (hari == 't') {
			hargaHari =(20 * hargaDasar / 100);
		}else if (hari == 'u') {
			hargaHari =(30 * hargaDasar / 100);
		}
		switch (hari) {
		case 's' :
			namaHari = "senin-kamis";
			break;
		case 't' :
			namaHari = "jumat";
			break;
		case 'u' : 
			namaHari = "sabtu-minggu";
			default :
				namaHari = "hari tidak valid";
		}
		
		switch (hari) {
		case 's' :
			persenanHari = "+10%";
			break;
		case 't' :
			persenanHari = "+20%";
			break;
		case 'u' : 
			persenanHari = "+30%";
			default :
				persenanHari = "persenan tidak valid";
		}
		
		if ( waktuTayang == 'a' ) {
			hargaWaktu =(10 * hargaDasar / 100);
		}else if ( waktuTayang == 'b' ) {
			hargaWaktu =(20 * hargaDasar / 100);
		}else if ( waktuTayang == 'c' ) {
			hargaWaktu =(30 * hargaDasar / 100);
		}
		switch (waktuTayang) {
		case 'a' :
			persenanWaktu = "+10%";
			break;
		case 'b' :
			persenanWaktu = "+20%";
			break;
		case 'c' : 
			persenanWaktu = "+30%";
			default :
				persenanWaktu = "persenan tidak valid";
		}
		switch (waktuTayang) {
		case 'a' :
			waktu = "pagi 10.00 - 12.00";
			break;
		case 'b' :
			waktu = "siang 12.00 - 17.00";
			break;
		case 'c' : 
			waktu = "malam 17.00 - 22.00";
			default :
				waktu = "waktu tidak valid";
		}
		
		if (jenisStudio == 'p' ) {
			hargaJenis = hargaDasar + 10000;
		}else if (jenisStudio == 'q' ) {
			hargaJenis = hargaDasar + 15000;
		}else if (jenisStudio == 'r' ) {
			hargaJenis = hargaDasar + 20000;
		}
		switch (jenisStudio) {
		case 'p' :
			hargaStudio = "10000";
			break;
		case 'q' :
			hargaStudio = "15000";
			break;
		case 'r' : 
			hargaStudio = "20000";
			default :
				hargaStudio = "persenan harga studio tidak valid";
		}
		switch (jenisStudio) {
		case 'p' :
			namaStudio = "reguler";
			break;
		case 'q' :
			namaStudio = "deluxe";
			break;
		case 'r' : 
			namaStudio = "premium";
			default :
				namaStudio = "studio tidak valid";
		}
		
		hargaPerTiket = hargaHari + hargaWaktu + hargaJenis;
		hargaTotal = hargaPerTiket * jumlahTiket;
		
		System.out.println("nama pembeli = " + namaPembeli);
		System.out.println("jumlah tiket = " + jumlahTiket);
		System.out.println("hari = " + namaHari);
		System.out.println("waktu tayang = " + waktu);
		System.out.println("studio = " + namaStudio);
		System.out.println("-----------------------------------------");
		System.out.println("harga dasar = " + hargaDasar);
		System.out.println("biaya hari = " + persenanHari);
		System.out.println("biaya waktu = " + persenanWaktu);
		System.out.println("harga pertiket = " + hargaPerTiket);
		System.out.println("-----------------------------------------");
		System.out.println("harga total = " + hargaTotal);
		
		
	}

}
