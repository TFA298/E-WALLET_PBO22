package ViewGUI;

import Controller.TopUpController;
import Entitiy.TopUpEntity;
import Entitiy.UserEntitiy;
import Model.UserModel;

import javax.swing.*;

public class TopUpFrame extends MainFrame{
    JButton backButton;
    JLabel titleLabel;
    JFormattedTextField nominalField;
    JButton confirmButton;
    TopUpController topUpController = new TopUpController();

    public TopUpFrame(){super("Tup Up",840,460);}
    @Override
    protected void component() {
        ImageIcon imgBack = loadImage("src/Assets/back-button.png",55,56);
        backButton = new JButton(imgBack);
        boundedAdd(backButton,9,28,55,56);
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);

        titleLabel = new JLabel("Masukkan Nominal");
        setSize(titleLabel,16);
        boundedAdd(titleLabel,66,280,151,17);

        nominalField = new JFormattedTextField();
        boundedAdd(nominalField,66,309,326,44);

        ImageIcon accept = loadImage("src/Assets/accept.png",78,78);
        confirmButton = new JButton(accept);
        boundedAdd(confirmButton,190,502,78,78);
        confirmButton.setOpaque(false);
        confirmButton.setContentAreaFilled(false);
        confirmButton.setBorderPainted(false);

    }

    @Override
    protected void event() {
        backButton.addActionListener((e) -> {
            new HomeFrame().setVisible(true);
            dispose();
        });

        confirmButton.addActionListener((e) -> {
            UserEntitiy akun = UserModel.getUserHasLogin();
            String nominal = nominalField.getText();
            int topUp = Integer.parseInt(nominal);
            if (topUp >= 10000) {
                TopUpEntity topUpp = new TopUpEntity(topUp);
                topUpController.topUp(akun, topUpp);
                JOptionPane.showMessageDialog(null,"Transaksi Berhasil","Information",JOptionPane.PLAIN_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Top Up minimal 10.000","Information",JOptionPane.WARNING_MESSAGE);
            }
        });
    }
}
