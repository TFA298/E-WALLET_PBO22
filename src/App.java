import Model.StorageModel;
import Model.UserModel;
import View.HomePage;

import java.util.Scanner;

public class App {

    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        StorageModel.initialItemPulsa();
        UserModel.initUser();
        new HomePage().run();
    }
}





