import java.util.Scanner;

public class MainPageApp {
    private Scanner scan = new Scanner(System.in);

    public mainPage(){
        runMain();
    }

    private void runMain(){
        String homePage = """
                Your UWU WALLET
                
                1. Top Up
                2. Isi Pulsa
                3. Profil
                4. Riwayat Transaksi
                5. Logout
                """;

        int menu;

        do{
            System.out.println("homePage");
            System.out.println("Pilih : ");
            menu = scan.nextInt();
            scan.nextLine();

            switch (menu){
                case 1 ->{

                }
                case 2 ->{

                }
                case 3 -> {

                }
                case 4 ->{

                }
            }
        }while (menu != 5);
    }

    private void pembeliPulsa(){

    }
}
