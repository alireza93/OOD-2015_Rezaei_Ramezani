import javax.swing.*;
import java.awt.event.*;

public class AddNewContent extends JDialog {
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

    public AddNewContent() {
        setSize(400, 600);
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
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
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
// add your code here
        dispose();
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

//    public static void main(String[] args) {
//        AddNewContent dialog = new AddNewContent();
//        dialog.pack();
//        dialog.setVisible(true);
//        System.exit(0);
//    }
}
