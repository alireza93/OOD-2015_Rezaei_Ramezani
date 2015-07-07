/**
 * Created by hamid on 7/8/2015.
 */

import java.awt.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                MainPage mainPage = new MainPage();
                mainPage.setVisible(true);
            }
        });

    }
}


