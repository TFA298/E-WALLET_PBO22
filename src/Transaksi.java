public class Transaksi {
    String jenisTrs;
    String tglTrs;
    String nominalHarga;
    String totalBayar;

    public void dataTransaksi() {
        System.out.println("Jenis Transaksi     = " + jenisTrs);
        System.out.println("Tanggal Transaksi   = " + tglTrs);
        System.out.println("Nominal Harga       = " + nominalHarga);
        System.out.println("Total Bayar         = " + totalBayar);
    }
}
