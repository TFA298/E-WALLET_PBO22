package Entitiy;

import Utility.NumericString;

public class Pulsa extends Transaksi {
    private VoucherPulsa vcrPulsa;
    private String kodeVcr;

    public Pulsa(VoucherPulsa vcrPulsa, int totalPayment) {
        super("Pembelian pulsa", vcrPulsa.getHarga(), totalPayment);
        this.vcrPulsa = vcrPulsa;
        this.kodeVcr = NumericString.generate(16);
    }

    public VoucherPulsa getVcrPulsa() {
        return vcrPulsa;
    }

    public void setVcrPulsa(VoucherPulsa vcrPulsa) {
        this.vcrPulsa = vcrPulsa;
    }

    public String getKodeVcr() {
        return kodeVcr;
    }

    public void setKodeVcr(String kodeVcr) {
        this.kodeVcr = kodeVcr;
    }
}
