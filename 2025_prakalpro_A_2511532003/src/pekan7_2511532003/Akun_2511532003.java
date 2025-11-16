package pekan7_2511532003;

public class Akun_2511532003 {
	    // atribut private
	    private String username;
	    private String password;
	    private String email;
	    private int pinAngka;

	    // setter
	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public void setPinAngka(int pinAngka) {
	        this.pinAngka = pinAngka;
	    }

	    // getter
	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public int getPinAngka() {
	        return pinAngka;
	    }

	    // validasi password
	    public boolean isPasswordValid() {
	        return password.length() >= 8;
	    }

	    // validasi email
	    public boolean isEmailValid() {
	        return email.contains("@") && email.contains(".");
	    }
	}



