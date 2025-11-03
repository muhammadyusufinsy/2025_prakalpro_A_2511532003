package pekan6_2511532003;

import java.util.Scanner;

public class doWhile1_2511532003 {
	public static void main (String [] args) {
		Scanner console = new Scanner (System.in);
		String phrase;
		do {
			System.out.print("input password: ");
			phrase = console.next();
			
		} while (!phrase.equals("abcd"));
	}

}
