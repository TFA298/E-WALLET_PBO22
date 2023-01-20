//import java.util.ArrayList;
//
//public class DataUser {
//    static ArrayList<User> datauser = new ArrayList<>();
//    String nama;
//    String username, password, no_Telp;
//    String pin;
//
//    public static void dataPertama() {
//        User user = new User("Teguh", "TFA", "123456","08123456789", "123");
//        datauser.add(user);
//    }
//
//    public static void seeData() {
//        for (User data : datauser) {
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
//            System.out.println("Nama  : " + data.getNama());
//            System.out.println("Username  : " + data.getUsername());
//            System.out.println("Password  : " + data.getPassword());
//            System.out.println("NO.Telp  : " + data.getNo_Telp());
//            System.out.println("pin  : " + data.getPin());
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
//        }
//    }
//
//    public static void addData(String nama, String username, String pass, String no_Telp, String pin) {
//        User user = new User(nama, username, pass, no_Telp, pin);
//        datauser.add(user);
//        System.out.println("Data berhasil dimasukkan");
//    }
//
//    public static int indexData(User user) {
//        int index = datauser.indexOf(user);
//        return index;
//    }
//
//    public static void editData(String newNama, String newUsername, String newPass, String newNo_Telp, String newPin) {
//        int index = indexData();
//    }
//
//    public static void dltData() {
//
//    }
//}
