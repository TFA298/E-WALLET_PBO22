public class Authorization {
    static User userLogged = null;

    public static User getUserLogged() {
        return userLogged;
    }

    public static void  initialUser() {
        User user = new User("Test", "user", "123", "081", "123456");

        EWallet.registrasiUser(user);
    }

    public static boolean login(String username, String password) {
        if((EWallet.getAkunTerdaftar().username.equals(username))
        && (EWallet.getAkunTerdaftar().password.equals(password))) {
            userLogged = EWallet.getAkunTerdaftar();
            return true;
        }
        else {
            return false;
        }
    }

    public static void logout() {

        userLogged = null;
    }
}
