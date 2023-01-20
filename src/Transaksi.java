public class Transaksi {
    String jenisTrs;
    String tglTrs;
    String nominalHarga;
    String totalBayar;

    public Transaksi(String jenisTrs, String nominalHarga, String totalBayar) {
        this.jenisTrs = jenisTrs;
        this.nominalHarga = nominalHarga;
        this.totalBayar = totalBayar;
        this.tglTrs = Date.now();
    }

    public void dataTransaksi() {
        System.out.println("Jenis Transaksi     = " + jenisTrs);
        System.out.println("Tanggal Transaksi   = " + tglTrs);
        System.out.println("Nominal Harga       = " + nominalHarga);
        System.out.println("Total Bayar =       = " + totalBayar);
    }
}
