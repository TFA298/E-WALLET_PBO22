public class EWallet {
    static User akunTerdaftar;

    public static User getAkunTerdaftar() {
        return akunTerdaftar;
    }

    public static boolean verifPin(String pin) {
        boolean status = akunTerdaftar.pin.equals(pin);

        return  status;
    }

    public static  boolean registrasiUser(User akunBaru) {
        if(akunTerdaftar != null){
            if ((akunTerdaftar.username.equals(akunBaru.username))
                || (akunTerdaftar.no_Telp.equals(akunBaru.no_Telp))) {
                return false;
            }
            else {
                akunTerdaftar = akunBaru;
                return true;
            }
        }
        else {
            akunTerdaftar =akunBaru;
            return true;
        }
    }
}
