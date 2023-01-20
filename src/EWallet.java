import java.util.ArrayList;

public class EWallet {
    static User akunTerdaftar;

    public static User getAkunTerdaftar() {
        return akunTerdaftar;
    }

    public static boolean verifPin(String pin){
        boolean status = akunTerdaftar.pin.equals(pin);

        return status;
    }

    public static boolean regisAkun(User newAkun){
        if (akunTerdaftar != null){
            if ((akunTerdaftar.username.equals(newAkun.username) || akunTerdaftar.no_Telp.equals(newAkun.no_Telp))){
                return false;
            }
            else {
                akunTerdaftar = newAkun;
                return true;
            }
        }
        else {
            akunTerdaftar = newAkun;
            return true;
        }
    }
}
