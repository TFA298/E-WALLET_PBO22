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

    public Dompet getDompet() {
        return dompet;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setNo_Telp(String no_Telp) {
        this.no_Telp = no_Telp;
    }

    public void setDompet(Dompet dompet) {
        this.dompet = dompet;
    }

    public User inputData() {
        System.out.println();
        System.out.println("Masukkan Nama Lengakp : " + nama);
        nama = input.nextLine();
        System.out.println("Masukkan Username : " + username);
        username = input.nextLine();
        System.out.println("Masukkan Password : " + password);
        password = input.nextLine();
        System.out.println("Masukkan No.Telepon SUe : " + no_Telp);
        no_Telp = input.nextLine();
        System.out.println("Masukkan Pin : " + pin);
        pin = input.nextLine();

        User user = new User(nama, username, no_Telp, password, pin);
        return user;
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

