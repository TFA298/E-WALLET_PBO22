import java.util.Scanner;
public class User{
    String nama;
    String username, password, no_Telp;
    String pin;
    Dompet dompet;

    Scanner input = new Scanner(System.in);
    public User(String nama, String username,String no_Telp, String pass, String pin) {
        this.nama = nama;
        this.username = username;
        password = pass;
        this.no_Telp = no_Telp;
        this.pin = pin;
        this.dompet = new Dompet();
    }

}

