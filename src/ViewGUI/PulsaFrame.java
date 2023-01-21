package ViewGUI;

import Controller.PulsaPurchaseController;
import Entitiy.UserEntitiy;
import Model.StorageModel;
import Model.UserModel;
import Utility.Rupiah;

import javax.swing.*;

public class PulsaFrame extends MainFrame{
    JLabel title, pulsa1, pulsa2, pulsa3, pulsa4;
    JButton backButton, pulsa1Button, pulsa2Button, pulsa3Button, pulsa4Button;
    PulsaPurchaseController ppController = new PulsaPurchaseController();
    public PulsaFrame(){
        super("Pembelian Pulsa",840,460);
    }

    @Override
    protected void component() {
        ImageIcon imgBack = loadImage("src/Assets/back-button.png",55,56);
        backButton = new JButton(imgBack);
        boundedAdd(backButton,9,28,55,56);
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);

        title = new JLabel("List Pulsa",SwingConstants.CENTER);
        setSize(title,40);
        boundedAdd(title,66,180,328,48);

        pulsa1Button = new JButton("Voucer " + Rupiah.format(10000));
        boundedAdd(pulsa1Button,66,281,117,52);

        pulsa1 = new JLabel("Rp. " +Rupiah.format(11500));
        setSize(pulsa1,16);
        boundedAdd(pulsa1,66,333,151,17);

        pulsa2Button = new JButton("Voucer " + Rupiah.format(25000));
        boundedAdd(pulsa2Button,277,281,117,52);

        pulsa2= new JLabel("Rp. " +Rupiah.format(25500));
        setSize(pulsa2,16);
        boundedAdd(pulsa2,277,335,151,17);

        pulsa3Button = new JButton("Voucer " + Rupiah.format(50000));
        boundedAdd(pulsa3Button,66,394,117,52);

        pulsa3 = new JLabel("Rp. " +Rupiah.format(50500));
        setSize(pulsa3,16);
        boundedAdd(pulsa3,66,446,151,17);

        pulsa4Button = new JButton("Voucer " + Rupiah.format(100000));
        boundedAdd(pulsa4Button,277,394,117,52);

        pulsa4 = new JLabel("Rp. " + Rupiah.format(100000));
        setSize(pulsa4,16);
        boundedAdd(pulsa4,277,448,151,17);
    }

    @Override
    protected void event() {
        StorageModel.getItemPulsa();
        UserEntitiy akun = UserModel.getUserHasLogin();

        backButton.addActionListener((e) -> {
            new HomeFrame().setVisible(true);
            dispose();
        });

        pulsa1.addAncestorListener((e) -> {
            if (> StorageModel.getItemPulsa().size()) {

            }
        });
    }
}
