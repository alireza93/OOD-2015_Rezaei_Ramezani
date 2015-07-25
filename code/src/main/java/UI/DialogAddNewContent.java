package UI;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DialogAddNewContent extends JDialog {
    private JPanel contentPane;
    private JButton registerButton;
    private JButton cancelButton;
    private JTextField TitleTextField;
    private JTextArea TextTextArea;
    private JTextField FilenameTextField;
    private JTextField LabelsTextField;
    private JLabel titleLabel;
    private JLabel textLabel;
    private JLabel filenameLabel;
    private JLabel labelsLabel;

    public DialogAddNewContent() {
        setSize(400, 600);
        setTitle("افزودن محتوای جدید");
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(registerButton);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        //TODO
    }

    private void onCancel() {
        //TODO
    }

}
