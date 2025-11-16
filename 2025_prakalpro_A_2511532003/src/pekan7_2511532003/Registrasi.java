package pekan7_2511532003;
import java.util.Scanner;
public class Registrasi {
	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Object Akun
	        Akun_2511532003 akun = new Akun_2511532003();

	        System.out.println("REGISTRASI AKUN BARU");

	        System.out.print("Masukkan Username: ");
	        String username = input.nextLine();
	        akun.setUsername(username);

	        System.out.print("Masukkan Password: ");
	        String password = input.nextLine();
	        akun.setPassword(password);

	        System.out.print("Masukkan Email: ");
	        String email = input.nextLine();
	        akun.setEmail(email);

	        System.out.print("Masukkan PIN (6 digit): ");
	        int pin = input.nextInt();
	        akun.setPinAngka(pin);

	        System.out.println();

	        // Validasi PASSWORD
	        if (!akun.isPasswordValid()) {
	            System.out.println("---");
	            System.out.println("REGISTRASI GAGAL");
	            System.out.println("Password Anda \"" + akun.getPassword() + "\" tidak valid.");
	            System.out.println("Password harus minimal 8 karakter.");
	            System.out.println("Silakan coba lagi.");
	            return;
	        }

	        // Validasi EMAIL
	        if (!akun.isEmailValid()) {
	            System.out.println("---");
	            System.out.println("REGISTRASI GAGAL");
	            System.out.println("Email Anda \"" + akun.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
	            System.out.println("Silakan coba lagi.");
	            return;
	        }

	        // Jika lolos semua validasi
	        System.out.println("REGISTRASI BERHASIL ---");
	        System.out.println("Akun untuk \"" + akun.getUsername() + "\" telah berhasil dibuat.");

	        System.out.println("---Detail Akun");
	        System.out.println("Username (Lowercase): " + akun.getUsername().toLowerCase());
	        System.out.println("Email (Uppercase) : " + akun.getEmail().toUpperCase());

	        // ID gabungan username + PIN
	        String idGabungan = akun.getUsername().concat(String.valueOf(akun.getPinAngka()));
	        System.out.println("ID Pengguna (Gabungan): " + idGabungan);

	        // Uji tipe data
	        System.out.println("--- Uji Tipe Data (PIN Anda: " + akun.getPinAngka() + ") ---");
	        System.out.println("PIN (int) + 10 = " + (akun.getPinAngka() + 10));

	        String pinString = "" + akun.getPinAngka(); // manipulasi String
	        System.out.println("PIN (String) + \"10\" = " + pinString + "10");

	        input.close();
	    }
	}



