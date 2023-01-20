import Entitiy.User;

public class Authorization {
    static User userHasLogin = null;

    public static User getUserHasLogin() {
        return userHasLogin;
    }

    public static boolean login(String username, String password) {
        for (User user : EWallet.getAkunTerdaftar()) {
            if((user.getUsername().equals(username)) && (user.getPassword().equals(password))) {
                userHasLogin = user;
                return true;
            }
        }return false;
    }

    public static boolean regis(User newAkun) {
        for (User akun: EWallet.getAkunTerdaftar()) {
            if (akun.getUsername().equals(newAkun.getUsername()) || akun.getNo_Telp().equals(newAkun.getNo_Telp()))
                return false;
        }
        EWallet.getAkunTerdaftar().add(newAkun);
        return true;
    }

    public static void logout() {
        userHasLogin = null;
    }

    public static boolean verifPin(String pin) {
        return userHasLogin.getPin().equals(pin);
    }
}
