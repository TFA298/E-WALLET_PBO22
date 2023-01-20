import java.util.Scanner;

public class App {

    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Storage.initialItemPulsa();
        EWallet.initUser();

        new LoginPage();
    }

}





