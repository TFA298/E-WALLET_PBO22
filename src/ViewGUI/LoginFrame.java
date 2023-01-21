package ViewGUI;

import Controller.AuthorizationController;

import javax.swing.*;

public class LoginFrame extends MainFrame {
    JLabel titleLabel;
    JLabel usernameLabel, passwordLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton masukButton;
    JButton daftarButton;
    JLabel background;
    AuthorizationController authCon = new AuthorizationController();
    public LoginFrame(){
        super("Login Menu", 840,468);
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("Login");
        setSize(titleLabel,64);
        boundedAdd(titleLabel,141,155,177,90);

        usernameLabel = new JLabel("Username");
        boundedAdd(usernameLabel,67,355,91,17);

        passwordLabel = new JLabel("Passsword");
        boundedAdd(passwordLabel,67,465,91,17);

        usernameField = new JTextField();
        boundedAdd(usernameField,67,372,326,48);

        passwordField = new JPasswordField();
        boundedAdd(passwordField,67, 482, 326,52);

        masukButton = new JButton("Masuk");
        setSize(masukButton,17);
        boundedAdd(masukButton,173, 596, 113,36);

        daftarButton = new JButton("Daftar");
        setSize(daftarButton,13);
        boundedAdd(daftarButton,177,644,105,28);
        daftarButton.setOpaque(false);
        daftarButton.setContentAreaFilled(false);
        daftarButton.setBorderPainted(false);
//        daftarButton.setBackground(Color.WHITE);
//        daftarButton.setBorder(new LineBorder(Color.WHITE));

        ImageIcon image = loadImage("src/Assets/Frame 2.png",460,810);
        background = new JLabel(image);
        boundedAdd(background,0,28,460,810);


    }

    @Override
    protected void event() {
        masukButton.addActionListener((e) -> {
            String username = usernameField.getText();
            String pass = passwordField.getText();
            boolean login = authCon.login(username,pass);
            if (!username.equals("") && !pass.equals("")){
                if(login){
                    new HomeFrame().setVisible(true);
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null,"Username atau password salah","Allert!!",JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Username dan Password harus diisi","Information",JOptionPane.WARNING_MESSAGE);
            }
        });

        daftarButton.addActionListener((e) -> {
            new RegisFrame().setVisible(true);
            dispose();
        });
    }
}
