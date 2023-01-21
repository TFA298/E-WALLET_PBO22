package ViewGUI;

import javax.swing.*;

public class HistoryFrame extends MainFrame{
    JButton backButton;
    public HistoryFrame(){
        super("Histpry Page",840,460);
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
    }

    @Override
    protected void event() {
        backButton.addActionListener((e) -> {
            new HomeFrame().setVisible(true);
            dispose();
        });
    }
}
