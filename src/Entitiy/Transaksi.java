package Entitiy;

import Utility.Date;

public class Transaksi {
    String jenisTrs;
    String tglTrs;
    int nominalHarga;
    int totalPayment;

    public Transaksi(String jenisTrs, int nominalHarga, int totalPayment) {
        this.jenisTrs = jenisTrs;
        this.nominalHarga = nominalHarga;
        this.totalPayment = totalPayment;
        this.tglTrs = Date.now();
    }

    public void dataTransaksi() {
        System.out.println("Jenis Entitiy.Transaksi     = " + jenisTrs);
        System.out.println("Tanggal Entitiy.Transaksi   = " + tglTrs);
        System.out.println("Nominal Harga       = " + nominalHarga);
        System.out.println("Total Bayar         = " + totalPayment);
    }

    public String getJenisTrs() {
        return jenisTrs;
    }

    public void setJenisTrs(String jenisTrs) {
        this.jenisTrs = jenisTrs;
    }

    public String getTglTrs() {
        return tglTrs;
    }

    public void setTglTrs(String tglTrs) {
        this.tglTrs = tglTrs;
    }

    public int getNominalHarga() {
        return nominalHarga;
    }

    public void setNominalHarga(int nominalHarga) {
        this.nominalHarga = nominalHarga;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }
}
