/**
 * Created by hamid on 7/8/2015.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
public class AddNewContent1 extends JFrame {
    public AddNewContent1() { initUI(); }

    private void initUI()
    {
        createElements();

        setTitle("اضافه کردن محتوا");
        setSize(400, 600);
        setLocationRelativeTo(null);
    }

    private void createElements()
    {
        JTextField title = new JTextField("عنوان", 1);


    }


}
