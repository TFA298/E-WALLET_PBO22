package Controller;
import Entitiy.DompetEntitiy;
import Entitiy.PulsaEntity;
import Entitiy.TransaksiEntity;
import Entitiy.UserEntitiy;
import Model.UserModel;
import Utility.Rupiah;

import javax.swing.table.DefaultTableModel;

public class HistoryController {
    UserEntitiy akun = UserModel.getUserHasLogin();
    DompetEntitiy dompet = akun.getDompet();

    public DefaultTableModel history(){

        DefaultTableModel dTableModel = new DefaultTableModel();
        Object[] kolom = {"Tanggal", "Pulsa", "Nominal", "Bayar", "Kode Voucher"};
        dTableModel.setColumnIdentifiers(kolom);
        for (TransaksiEntity transaksi : dompet.getListTransaksi()) {
            if (transaksi instanceof PulsaEntity) {
                PulsaEntity pulsa = (PulsaEntity) transaksi;
                Object[] data = new Object[5];
                data[0] = transaksi.getTglTrs();
                data[1] = pulsa.getVcrPulsa().getTitle();
                data[2] = Rupiah.format(pulsa.getVcrPulsa().getHarga());
                data[3] = Rupiah.format(transaksi.getTotalPayment());
                data[4] = pulsa.getKodeVcr();
                dTableModel.addRow(data);
            }
            else {
                Object[] data = new Object[5];
                data[0] = transaksi.getTglTrs();
                data[3] = Rupiah.format(transaksi.getTotalPayment());
                dTableModel.addRow(data);
            }
        }
        return dTableModel;
    }
}
