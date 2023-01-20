public class Authorization {
    static User userLogged = null;

    public static User getUserLogged() {
        return userLogged;
    }

    public static boolean login(String username, String password) {
        for (User user : EWallet.getAkunTerdaftar()) {
            if((user.username.equals(username)) && (user.password.equals(password))) {
                userLogged = user;
                return true;
            }
        }return false;
    }

    public static boolean regis(User newAkun) {
        for (User akun: EWallet.getAkunTerdaftar()) {
            if (akun.username.equals(newAkun.username) || akun.no_Telp.equals(newAkun.no_Telp))
                return false;
        }
        EWallet.getAkunTerdaftar().add(newAkun);
        return true;
    }

    public static void logout() {
        userLogged = null;
    }

    public static boolean verifPin(String pin) {
        return userLogged.pin.equals(pin);
    }
}
