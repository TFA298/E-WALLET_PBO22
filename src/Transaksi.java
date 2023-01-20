public class Transaksi {
    String jenisTrs;
    String tglTrs;
    int nominalHarga;
    int totalBayar;

    public Transaksi(String jenisTrs, int nominalHarga, int totalBayar) {
        this.jenisTrs = jenisTrs;
        this.nominalHarga = nominalHarga;
        this.totalBayar = totalBayar;
        this.tglTrs = Date.now();
    }

    public Transaksi(String jenisTrs2, int nominalTopup) {
    }

    public void dataTransaksi() {
        System.out.println("Jenis Transaksi     = " + jenisTrs);
        System.out.println("Tanggal Transaksi   = " + tglTrs);
        System.out.println("Nominal Harga       = " + nominalHarga);
        System.out.println("Total Bayar         = " + totalBayar);
    }
}
