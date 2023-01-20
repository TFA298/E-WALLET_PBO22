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

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getNo_Telp() {
        return no_Telp;
    }

    public String getPassword() {
        return password;
    }

    public String getPin() {
        return pin;
    }


    public void dataUser() {
        System.out.println("Nama Anda   : " + nama);
        System.out.println("Username    : " + username);
        System.out.println("Password    : " + password);
        System.out.println("Nomer HP    : " + no_Telp);
        System.out.println("PIN         : " + pin);
        dompet.dataDompet();
    }
}

