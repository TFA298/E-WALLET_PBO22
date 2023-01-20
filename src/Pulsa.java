public class Pulsa {
    private VoucherPulsa vcrPulsa;
    private String kodeVcr;

    public Pulsa(VoucherPulsa vcrPulsa, int totalBayar) {
        this.vcrPulsa = vcrPulsa;
        this.kodeVcr = NumericString.generate(16);
    }

    public void dataPulsa() {
        System.out.println("Nominal Pulsa  = " + vcrPulsa.title);
        System.out.println("Harga Pulsa    = " + vcrPulsa.harga);
        System.out.println("Voucher        = " + kodeVcr);
    }
}
