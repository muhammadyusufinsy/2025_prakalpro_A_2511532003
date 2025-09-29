package pekan4;

import java.util.Scanner;

public class multiIF {
	public static void main (String [] args ) {
		int umur;
		char sim;
		Scanner a = new Scanner(System.in);
		System.out.print("input umur anda: ");
		umur = a.nextInt();
		System.out.print("apakah anda sudah punya Sim C: ");
		sim = a.next().charAt(0);
		a.close();
		if((umur >= 17) && (sim=='y')) { 
			System.out.println("Anda sudah dewasa dan boleh bawa motor");
		}
		if((umur >= 17) && (sim!='y')) { 
			System.out.println("Anda sudah dewasa tapi tidak boleh bawa motor");
		}
		if((umur < 17) && (sim!='y')) { 
			System.out.println("Anda belum cukup umur bawa motor");
		}
		if((umur < 17) && (sim=='y')) { 
			System.out.println("Anda belum cukup umur untuk punya SIM");
		}
	}

}
	
