package Entitiy;

import java.util.ArrayList;

public class Dompet {
    int pemasukan = 0;
    int pengeluaran = 0;
    private Saldo saldo = new Saldo();
    private ArrayList<Transaksi> listTransaksi = new ArrayList<>();

    public Dompet() {
    }

    public Dompet(int income) {
        this.pemasukan = income;
    }

    public void tambahTrs(Transaksi transaksi){
        if (transaksi instanceof TopUp){
            pemasukan += transaksi.nominalHarga;
        }
        else {
            pengeluaran += transaksi.totalPayment;
        }
        listTransaksi.add(transaksi);
    }

    public int getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(int pemasukan) {
        this.pemasukan = pemasukan;
    }

    public int getPengeluaran() {
        return pengeluaran;
    }

    public void setPengeluaran(int pengeluaran) {
        this.pengeluaran = pengeluaran;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Transaksi> getListTransaksi() {
        return listTransaksi;
    }

    public void setListTransaksi(ArrayList<Transaksi> listTransaksi) {
        this.listTransaksi = listTransaksi;
    }
}
