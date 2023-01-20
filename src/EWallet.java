import Entitiy.TopUp;
import Entitiy.Transaksi;
import Entitiy.User;

import java.util.ArrayList;

public class EWallet {

    private static ArrayList<User> registeredAkun = new ArrayList<>();

    public static void initUser(){
        User user = new User("Teguh Firdaus Alfaraih","TFA", "081331065985" , "12345","123");
        Authorization.regis(user);
    }

    public static ArrayList<User> getAkunTerdaftar() {
        return registeredAkun;
    }

    public static int cekSaldo(User user) {
        return user.getDompet().getSaldo().getSaldo();
    }

    public static void topUp(User user, TopUp trs) {
        user.getDompet().tambahTrs(trs);
        user.getDompet().getSaldo().tambahSaldo(trs.getNominalHarga());
    }

    public static boolean pulsaPurchase(User user, Transaksi trs) {
        boolean status = user.getDompet().getSaldo().ambilSaldo(trs.getTotalPayment());
        if (status){
            user.getDompet().tambahTrs(trs);
        }
        return status;
    }
}
