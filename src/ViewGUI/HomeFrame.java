package ViewGUI;

import Entitiy.UserEntitiy;
import Model.UserModel;
import Utility.Rupiah;

import javax.swing.*;
import java.awt.*;

public class HomeFrame extends MainFrame{
    JLabel welcomeLabel;
    JLabel cashLabel,moneyLabel,totalLabel;
    JButton topUpButton, historyButton, pulsaButton, logoutButton;
    JLabel topUpLabel, pulsaLabel, historyLabel, logoutLabel, topUpLabel2, pulsaLabel2, historyLabel2, logoutLabel2, historyLabel3;
    JLabel bg1Label,bg2Label;
    UserEntitiy akun = UserModel.getUserHasLogin();
    int saldo = akun.getDompet().getSaldo().getSaldo();

    public HomeFrame(){
        super("Home Menu", 840,468);}

    @Override
    protected void component() {
//        welcome = new JLabel("<html>Welcome,<br> Your UWU Wallet</html>");
//        setSize(welcome,20);
//        boundedAdd(welcome,8,45,173,58);
        welcomeLabel = new JLabel("Welcome to UWU Wallet",SwingConstants.CENTER);
        setSize(welcomeLabel,32);
        boundedAdd(welcomeLabel,25,87,410,66);;

        cashLabel = new JLabel("UWU Cash");
        setSize(cashLabel,20);
        boundedAdd(cashLabel,25,186,105,27);

        totalLabel = new JLabel("Total Saldo");
        setSize(totalLabel,20);
        boundedAdd(totalLabel,25,227,124,27);

        moneyLabel = new JLabel("Rp."+ Rupiah.format(saldo));
        setSize(moneyLabel,20);
        boundedAdd(moneyLabel,25,246,126,31);

        ImageIcon topUp2 = loadImage("src/Assets/Top up credit-pana.png",141,141);
        topUpLabel = new JLabel(topUp2);
        boundedAdd(topUpLabel,54,370,141,141);
        topUpLabel.setOpaque(false);

        ImageIcon topUp = loadImage("src/Assets/Rectangle 24.png",155,155);
        topUpButton = new JButton(topUp);
        boundedAdd(topUpButton,47,363,155,155);
        topUpButton.setOpaque(false);
        topUpButton.setContentAreaFilled(false);
        topUpButton.setBorderPainted(false);
        topUpButton.setFocusPainted(false);

        topUpLabel2 = new JLabel("Top Up", SwingConstants.CENTER);
        setSize(topUpLabel2,16);
        boundedAdd(topUpLabel2,73,521,98,21);

        ImageIcon pulsa2 = loadImage("src/Assets/Add to Cart-amico.png",141,141);
        pulsaLabel = new JLabel(pulsa2);
        boundedAdd(pulsaLabel,263,370,141,141);

        ImageIcon pulsa = loadImage("src/Assets/Rectangle 30.png",155,155);
        pulsaButton = new JButton(pulsa);
        boundedAdd(pulsaButton ,256,363,155,155);
        pulsaButton.setOpaque(false);
        pulsaButton.setContentAreaFilled(false);
        pulsaButton.setBorderPainted(false);

        pulsaLabel2 = new JLabel("Pulsa", SwingConstants.CENTER);
        setSize(pulsaLabel2,16);
        boundedAdd(pulsaLabel2,285,527,98,21);

        ImageIcon history2 = loadImage("src/Assets/Stamp collecting-amico.png",141,141);
        historyLabel = new JLabel(history2);
        boundedAdd(historyLabel,54,619,141,141);

        ImageIcon history = loadImage("src/Assets/Rectangle 31.png",155,155);
        historyButton = new JButton(history);
        boundedAdd(historyButton,47,612,155,155);
        historyButton.setOpaque(false);
        historyButton.setContentAreaFilled(false);
        historyButton.setBorderPainted(false);

        historyLabel2 = new JLabel("Riwayat", SwingConstants.CENTER);
        setSize(historyLabel2,16);
        boundedAdd(historyLabel2,73,770,98,21);

        historyLabel3 = new JLabel("Transaksi", SwingConstants.CENTER);
        setSize(historyLabel3,16);
        boundedAdd(historyLabel3,73,788,98,21);

        ImageIcon logout2 = loadImage("src/Assets/Quitting a job-bro.png",141,141);
        logoutLabel = new JLabel(logout2);
        boundedAdd(logoutLabel,263,619,141,141);

        ImageIcon logout = loadImage("src/Assets/Rectangle 34.png",155,155);
        logoutButton = new JButton(logout);
        boundedAdd(logoutButton,256,612,155,155);
        logoutButton.setOpaque(false);
        logoutButton.setContentAreaFilled(false);
        logoutButton.setBorderPainted(false);

        logoutLabel2 = new JLabel("Logout", SwingConstants.CENTER);
        setSize(logoutLabel2,16);
        boundedAdd(logoutLabel2,285,776,98,21);

        ImageIcon background2 = loadImage("src/Assets/Rectangle 23.png",420,506);
        bg2Label = new JLabel(background2);
        boundedAdd(bg2Label,20,312,420,506);

        ImageIcon background1 = loadImage("src/Assets/Frame 4.png",460,840);
        bg1Label = new JLabel(background1);
        boundedAdd(bg1Label,0,28,460,810);
    }

    @Override
    protected void event() {
        topUpButton.addActionListener((e) -> {
            new TopUpFrame().setVisible(true);
            dispose();
        });

        pulsaButton.addActionListener((e) -> {
            new PulsaFrame().setVisible(true);
            dispose();
        });

        historyButton.addActionListener((e) -> {
            new HistoryFrame().setVisible(true);
            dispose();
        });

        logoutButton.addActionListener((e) -> {
            new LoginFrame().setVisible(true);
            dispose();
        });
    }
}
