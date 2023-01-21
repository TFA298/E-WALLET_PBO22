package ViewGUI;

import Controller.HistoryController;

import javax.swing.*;

public class HistoryFrame extends MainFrame{

    JLabel titleLabel;
    JButton backButton;
    JTable historyTable;
    JScrollPane historyScroll;
    HistoryController history = new HistoryController();
    public HistoryFrame(){
        super("History Page",840,460);
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

        titleLabel = new JLabel("Riwayat Transaksi",SwingConstants.CENTER);
        setSize(titleLabel,36);
        boundedAdd(titleLabel,66,177,328,48);


        historyTable = new JTable();
        historyScroll = new JScrollPane(historyTable);
        historyTable.setModel(history.history());
        boundedAdd(historyScroll,51,285,360,473);
    }

    @Override
    protected void event() {
        backButton.addActionListener((e) -> {
            new HomeFrame().setVisible(true);
            dispose();
        });
    }
}
