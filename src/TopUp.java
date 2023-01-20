public class TopUp{
    int nominalTopup;

    public TopUp(String jenisTrs, int nominalTopup) {
        this.nominalTopup = nominalTopup;
    }

    public void dataTopup() {
        System.out.println("Nominal Topup   = " + nominalTopup);
    }
}
