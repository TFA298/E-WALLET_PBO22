package Entitiy;

public class TopUp extends Transaksi {
    int nominalTopup;

    public TopUp(int nominalTopup) {
        super("Top Up", nominalTopup, nominalTopup);
    }

}
