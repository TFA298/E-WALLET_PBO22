import java.util.Scanner;

public class LoginPage {
    Scanner input = new Scanner(System.in);

    public LoginPage() {
        run();
    }

    void run() {
        String str = """
            1. Login
            2. Register
            3. Keluar
            """;

        int menu = -1;

        do{
            System.out.println(str);
            System.out.println("Pilih: ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu){
                case 1:
                    loginMenu();
                    break;
                case 2:
                    registrasiMenu();
                    break;
                case 0:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak benar");
                    break;
            }
            System.out.println();
        }while (menu != 0);
    }

    void registrasiMenu() {
        String nama, username, password, noTelp, pin;

        do {
            System.out.println("~~~~~~Pendaftaran Akun~~~~~~");
            System.out.println("Nama        = ");
            nama = input.nextLine();

            System.out.println("Username    = ");
            username = input.nextLine();

            System.out.println("No.Telp     = ");
            noTelp = input.nextLine();

            System.out.println("Password    = ");
            password = input.nextLine();

            System.out.println("PIN         = ");
            pin = input.nextLine();

            User newUser = new User(nama, username, noTelp, password, pin);

            if (EWallet.registrasiUser(newUser)) {
                System.out.println("Akun anda berhasil dibuat");
                break;
            }
            else {
                System.out.println("Akun anda telah terdaftar");
            }
        }while (true);
    }

    void loginMenu() {
        String username, password;
        boolean status = false;

        do {
            System.out.println("~~~~~~~LOGIN~~~~~~~");

            System.out.println("Username    = ");
            username = input.nextLine();

            System.out.println("Password    = ");
            password = input.nextLine();

            status = Authorization.login(username, password);

            if (status) {
                System.out.println("Anda telah masuk");
                System.out.println();
            }
            else {
                System.out.println("Username atau password yang anda masukkan salah");
                System.out.println();
            }
        }while (status == false);
    }
}
