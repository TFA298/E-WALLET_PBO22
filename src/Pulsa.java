public class Pulsa extends Transaksi{
    private VoucherPulsa vcrPulsa;
    private String kodeVcr;

    public Pulsa(VoucherPulsa vcrPulsa,int totalPayment) {
        super("Pembelian Pulsa",vcrPulsa.harga, totalPayment);
        this.vcrPulsa = vcrPulsa;
        this.kodeVcr = NumericString.generate(16);
    }
}
