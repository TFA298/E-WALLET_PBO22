public class Saldo {
    int saldo;

    public Saldo() {
        saldo = 0;
    }

    public void tambahSaldo(int nominal) {

        saldo += nominal;
    }

    public void ambilSaldo (int nominal){

    }
    public void dataSaldo() {
        System.out.println( "Saldo anda saat ini senilai : " + saldo);
    }
}
