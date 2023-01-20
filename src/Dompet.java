import java.util.ArrayList;

public class Dompet {
    int pemasukan = 0;
    int pengeluaran = 0;
    Saldo saldo = new Saldo();

    public Dompet() {
    }

    public Dompet(int income) {
        this.pemasukan = income;
    }

    public void dataDompet() {
        saldo.dataSaldo();
        System.out.println("Pemasukan   : " + pemasukan);
        System.out.println("Pengeluaran : " + pengeluaran);
    }
}
