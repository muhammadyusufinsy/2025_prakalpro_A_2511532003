package pekan2;
import java.util.Scanner;
public class tugasAlproPekan2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int nomorBangku;
		char kategori = 'X';
		int batasBangku = 90;
		
		
		
		
	
		System.out.print("silahkan pilih bangku yang ingin anda ambil :");
		nomorBangku = input.nextInt();
		if (nomorBangku < 1 || nomorBangku > batasBangku ) {
			System.out.println("bangku tidak tersedia");
			return;
		}
		
		if (nomorBangku <= 30) {
			kategori = 'A';
			System.out.println("kategori bangku :" + kategori);
		} else if (nomorBangku < 60) {	
			kategori = 'B';
			System.out.println("kategori bangku :" + kategori);
		}else if (nomorBangku < 90) {
			kategori = 'C';
			System.out.println("kategori bangku :" + kategori);
		}
		
		boolean tersedia = nomorBangku < batasBangku;
		
		
		if (tersedia) {
			System.out.println("bangku tersedia");
		}else {
			System.out.println("bangku tidak tersedia");
		}
		
		float hargaA = 75000.5f;
		float hargaB = 50000.5f;
		float hargaC = 25000.5f;
		
		if (kategori == 'A') {
			System.out.println("bangku nomor " + nomorBangku + " seharga " + hargaA );
		}else if (kategori == 'B') {
			System.out.println("bangku nomor " + nomorBangku + " seharga " + hargaB );
		}else if (kategori == 'C') {
			System.out.println("bangku nomor " + nomorBangku + " seharga " + hargaC );
		}
		
	}

}
