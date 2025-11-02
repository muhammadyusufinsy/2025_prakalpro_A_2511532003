package Pekan5;

public class TugasPekan5 {
	public static void main (String [] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=(-2 * i + 10) ; j++) {
				System.out.print(" ");
			}
			System.out.print("<");
			for (int j = 1; j < i; j++) {
				System.out.print("....");
			}
			System.out.print(">");
			System.out.println();
			}
		for (int i = 1; i <= 4; i++) {
			for ( int j = 1; j <= (2 * i); j++ ) {
				System.out.print(" ");
			}
			System.out.print("<");
			for ( int j = 1; j <= (-1 * i + 4); j++) {
				System.out.print("....");
			}
			System.out.print(">");
			System.out.println();
		}
		
			}
			
		}

