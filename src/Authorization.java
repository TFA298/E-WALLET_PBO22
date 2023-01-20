public class Authorization {
    static User userLogged = null;

    public static User getUserLogged() {
        return userLogged;
    }
    public static void initUser(){
        User user = new User("Teguh Firdaus Alfaraih","TFA", "081331065985" , "12345","123");
        EWallet.regisAkun(user);
    }
    public static boolean login(String username, String password) {
        if((EWallet.getAkunTerdaftar().username.equals(username) && EWallet.getAkunTerdaftar().password.equals(password))){
            userLogged = EWallet.getAkunTerdaftar();
        }
        else {
            return false;
        }
    }

    public static void logout() {
        userLogged = null;
    }
}
