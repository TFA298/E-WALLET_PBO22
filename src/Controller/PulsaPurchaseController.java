package Controller;

import Entitiy.TransaksiEntity;
import Entitiy.UserEntitiy;

public class PulsaPurchaseController {
    public boolean pulsaPurchase(UserEntitiy userEntitiy, TransaksiEntity trs) {
        boolean status = userEntitiy.getDompet().getSaldo().ambilSaldo(trs.getTotalPayment());
        if (status){
            userEntitiy.getDompet().tambahTrs(trs);
        }
        return status;
    }
}
