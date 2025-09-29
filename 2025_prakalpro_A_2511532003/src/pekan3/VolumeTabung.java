package pekan3;

import java.util.Scanner;

public class VolumeTabung {
	public static void main (String[] args) {
		int r;
		int t;
		final double PI = 3.14;
		double hasil;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("masukan jari jari tabung = ");
		r = keyboard.nextInt();
		System.out.println("masukan tinggi tabung = ");
		t = keyboard.nextInt();
		keyboard.close();
		hasil = PI * r * r * t;
		
		System.out.println("volume tabung adalah = " + hasil);
		
	}
}
