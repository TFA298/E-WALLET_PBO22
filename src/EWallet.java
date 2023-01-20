import java.util.ArrayList;

public class EWallet {

    private static ArrayList<User> registeredAkun = new ArrayList<>();

    public static void initUser(){
        User user = new User("Teguh Firdaus Alfaraih","TFA", "081331065985" , "12345","123");
        Authorization.regis(user);
    }

    public static ArrayList<User> getAkunTerdaftar() {
        return registeredAkun;
    }

}
