package pekan6_2511532003;

import java.util.Random;

public class tugasPekan6_2511532003 {
	public static void main(String[] args) {
        Random rand = new Random();
        
        int dadu1, dadu2, jumlah;
        
        // lempar dadu pertama kali
        dadu1 = rand.nextInt(6) + 1; // menghasilkan angka 1–6
        dadu2 = rand.nextInt(6) + 1;
        jumlah = dadu1 + dadu2;
        
        // tampilkan hasil lemparan pertama
        System.out.println("Lempar dadu: " + dadu1 + " dan " + dadu2 + " = " + jumlah);
        
        // lakukan perulangan sampai jumlahnya 7
        while (jumlah != 7) {
            dadu1 = rand.nextInt(6) + 1;
            dadu2 = rand.nextInt(6) + 1;
            jumlah = dadu1 + dadu2;
            
            System.out.println("Lempar dadu: " + dadu1 + " dan " + dadu2 + " = " + jumlah);
        }
        
        System.out.println("Berhenti! Hasil penjumlahan dadu = 7");
    }
}

