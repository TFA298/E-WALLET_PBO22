package ViewGUI;

import Controller.AuthorizationController;
import Entitiy.UserEntitiy;

import javax.swing.*;

public class RegisFrame extends MainFrame{
    JButton backButton;
    JLabel title, nameLabel, usernameLabel, noTelpLabel, passLabel, pinLabel;
    JTextField name,username,noTelp;
    JPasswordField password, pin;
    JButton signButton;
    AuthorizationController authCon = new AuthorizationController();

    public RegisFrame(){super("Regis Menu",840,460);}

    @Override
    protected void component() {
        ImageIcon imgBack = loadImage("src/Assets/back-button.png",55,56);
        backButton = new JButton(imgBack);
        boundedAdd(backButton,9,28,55,56);
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);

        title = new JLabel("Registrasi",SwingConstants.CENTER);
        setSize(title,40);
        boundedAdd(title,64,88,328,48);

        nameLabel = new JLabel("Nama");
        boundedAdd(nameLabel, 68, 179, 91, 17);

        name = new JTextField();
        boundedAdd(name,66,196,326,48);

        usernameLabel = new JLabel("Username");
        boundedAdd(usernameLabel,68,283,91,17);

        username = new JTextField();
        boundedAdd(username,66,300,326,48);

        noTelpLabel = new JLabel("No.Telp");
        boundedAdd(noTelpLabel,68,388,91,17);

        noTelp = new JTextField();
        boundedAdd(noTelp,66,405,326,48);

        passLabel = new JLabel("Password");
        boundedAdd(passLabel,68,491,91,17);

        password = new JPasswordField();
        boundedAdd(password,66, 508, 326, 48);

        pinLabel = new JLabel("PIN");
        boundedAdd(pinLabel,68,593,91,17);

        pin = new JPasswordField();
        boundedAdd(pin,66,610,326,52);

        signButton = new JButton("Daftar");
        boundedAdd(signButton,174,716,113,36);
    }

    @Override
    protected void event() {
        backButton.addActionListener((e) -> {
            new LoginFrame().setVisible(true);
            dispose();
        });

        signButton.addActionListener((e) -> {
            String nama = name.getText();
            String usename = username.getText();
            String noTlp = noTelp.getText();
            String pass = password.getText();
            String PIN = pin.getText();
            UserEntitiy newUserEntity = new UserEntitiy(nama,usename,noTlp,pass,PIN);
            if (!nama.equals("") && !usename.equals("") && !noTlp.equals("") && !pass.equals("") && !PIN.equals("")){
                if (authCon.regis(newUserEntity)) {
                    JOptionPane.showMessageDialog(null,"Akun berhasil dibuat","Infortmation",JOptionPane.PLAIN_MESSAGE);
                    new LoginFrame().setVisible(true);
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Username atau No.Telp telah digunakan");
                }

            }
            else {
                JOptionPane.showMessageDialog(null,"Diisi bwang....","Information",JOptionPane.WARNING_MESSAGE);
            }
        });
    }
}
