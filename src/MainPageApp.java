import Entitiy.*;
import Utility.Rupiah;

import java.util.Scanner;

public class MainPageApp {
    private Scanner scan = new Scanner(System.in);

    public MainPageApp(){
        runMain();
    }

    private void runMain(){
        String homePage = """
                Your UWU WALLET
                1. Cek Saldo
                2. Top Up
                3. Beli Pulsa
                4. Riwayat Transaksi
                0. Logout
                """;

        int menu;

        do{
            System.out.println(homePage);
            System.out.print("Pilih : ");
            menu = scan.nextInt();
            scan.nextLine();

            switch (menu){
                case 0 ->{
                    System.out.println("Anda telah keluar");
                }
                case 1 ->{
                    cekSaldo();
                }
                case 2 ->{
                    menuTopUp();
                }
                case 3 -> {
                    pembeliPulsa();
                }
                case 4 ->{
                    historyTrs();
                }
            }
        }while (menu != 0);
    }

    private void pembeliPulsa(){
        Storage.getItemPulsa();
        User akun = Authorization.getUserHasLogin();
        int pilih = -1;

        do {
            System.out.println("""
                    =========================
                    ==   PEMBELIAN PULSA   ==
                    =========================""");
            System.out.println("Ketikkan -1 untuk pembatalan");
            Storage.seeItemPulsa();
            System.out.println("Pilih : ");
            pilih = scan.nextInt();
            scan.nextLine();

            if (pilih == -1){
                System.out.println("Proses Pembelian Entitiy.Pulsa Dibatalkan");
                break;
            }

            if (pilih > Storage.getItemPulsa().size()) {
                System.out.println("""
                        Nominal yang anda masukkan tidak ada
                        Mohon masukkan nominal dengan benar
                        """);
                System.out.println();
            }
            else {
                VoucherPulsa pulsa = Storage.getItemPulsa().get(pilih - 1);
                int totalBayar =  pulsa.getHarga();

                int test = 3;
                do {
                    System.out.println("Masukkan PIN anda : ");
                    String pin = scan.nextLine();

                    if (Authorization.verifPin(pin)) {
                        if (akun.getDompet().getSaldo().getSaldo() >= totalBayar){
                            Pulsa newTrs = new Pulsa(pulsa, totalBayar);

                            EWallet.pulsaPurchase(akun, newTrs);
                            System.out.println("Voucher pulsa senilai Rp." + Rupiah.format(pulsa.getHarga()));
                            System.out.println("Voucher         : " + pulsa.getTitle());
                            System.out.println("Harga           : Rp." + Rupiah.format(pulsa.getHarga()));
                            System.out.println("Total           : Rp." + Rupiah.format(totalBayar));
                            System.out.println("Kode Voucher    : " + newTrs.getKodeVcr());
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            scan.nextLine();
                            System.out.println();
                            break;
                        }
                        else {
                            System.out.println("Entitiy.Saldo kurang!!");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("Ingin melanjutkan ? ");
                            scan.nextLine();
                            System.out.println();
                            break;
                        }
                    }
                    else {
                        test -= 1;
                        System.out.println("PIN tidak valid");
                        if (test == 0) {
                            System.out.println("Anda telah gagal sebanyak 3x");
                            System.out.println("Silahkan coba lagi");
                            System.out.println();
                            break;
                        }
                        System.out.println();
                    }
                }
                while (test > 0);
            }
        }
        while (pilih != -1);
    }

    private void menuTopUp() {
        User akun = Authorization.getUserHasLogin();

        int nominal = 0;
        do {
            System.out.println("""
                    ========================
                    ==       TOP UP       ==
                    ========================""");
            System.out.println("Masukkan -1 untuk pembatalan");

            System.out.print("Masukkan Nominal Rp. ");
            nominal = scan.nextInt();
            scan.nextLine();

            if (nominal >= 10000) {
                TopUp topUp = new TopUp(nominal);
                EWallet.topUp(akun, topUp);

                System.out.printf("Top up senilai Rp.%s telah berhasil\n", Rupiah.format(nominal));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Ingin melanjutkan?");
                scan.nextLine();
                System.out.println();
                break;
            }
            else {
                System.out.println("Tup Up minimal Rp.10,000");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println();
            }
        }while (nominal != -1);
    }

    private void cekSaldo() {
        System.out.println("""
                    =======================
                    ==     CEK SALDO     ==
                    =======================""");
        User akun = Authorization.getUserHasLogin();

            int saldo = akun.getDompet().getSaldo().getSaldo();
            int income = akun.getDompet().getPemasukan();
            int outcome = akun.getDompet().getPengeluaran();
            System.out.printf("Total Entitiy.Saldo     = Rp.%s\n", Rupiah.format(saldo));
            System.out.println("Pemasukan       = Rp." + Rupiah.format(income));
            System.out.printf("Pengeluaran     = Rp.%S\n", Rupiah.format(outcome));
            System.out.println();
            System.out.println("Ketik 0 untuk kembali ke menu");
    }

    private void historyTrs() {
        User akun = Authorization.getUserHasLogin();
        Dompet dompet = akun.getDompet();

        System.out.println("""
                    =======================
                    ==     TRANSAKSI     ==
                    =======================""");

        for (Transaksi transaksi : dompet.getListTransaksi()) {
            if (transaksi instanceof Pulsa) {
                Pulsa pulsa = (Pulsa) transaksi;
                System.out.println("Tanggal Entitiy.Transaksi   = "+ transaksi.getTglTrs());
                System.out.println("Entitiy.Pulsa               = Rp."+ pulsa.getVcrPulsa().getTitle());
                System.out.println("Nominal             = Rp."+ Rupiah.format(pulsa.getVcrPulsa().getHarga()));
                System.out.println("Bayar               = Rp."+ Rupiah.format(transaksi.getTotalPayment()));
                System.out.println("Kode Voucher        = "+ pulsa.getKodeVcr());
            }
            else {
                System.out.println("Tanggal Entitiy.Transaksi   = "+ transaksi.getTglTrs());
                System.out.println("Nominal Entitiy.Transaksi   = Rp."+ Rupiah.format(transaksi.getNominalHarga()));
            }
            System.out.println("========================================");
        }
        System.out.println();
        System.out.println();
    }
}
