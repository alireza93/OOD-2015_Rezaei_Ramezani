/**
 * Created by hamid on 7/8/2015.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by hamid on 7/8/2015.
 */
public class MainPage extends JFrame{
    private JFormattedTextField formattedTextField1;

    public MainPage()
    {
        initUI();
    }

    private void initUI()
    {
        createMenuBar();

        setTitle("?????? ?????? ????");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon("exit.png");

        JMenu file = new JMenu("????");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem eMenuItem = new JMenuItem("????", icon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("???? ?? ??????");
        eMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        file.add(eMenuItem);
        menubar.add(file);

        JMenu contentManagement = new JMenu("?????? ?????");
        file.setMnemonic(KeyEvent.VK_C);

        JMenuItem CMeMenuItem = new JMenuItem("????", icon);
        CMeMenuItem.setMnemonic(KeyEvent.VK_E);
        CMeMenuItem.setToolTipText("Exit application");
        CMeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        file.add(eMenuItem);
        menubar.add(file);

        setJMenuBar(menubar);
    }




}
