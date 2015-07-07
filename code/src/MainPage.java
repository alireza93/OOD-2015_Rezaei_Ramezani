/**
 * Created by hamid on 7/8/2015.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by hamid on 7/8/2015.
 */
public class MainPage extends JFrame{
    public MainPage()
    {
        initUI();
    }

    private void initUI()
    {
        createMenuBar();

        setTitle("سامانه مدیریت دانش");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon("exit.png");

        JMenu file = new JMenu("فایل");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem eMenuItem = new JMenuItem("خروج", icon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("خروج از سامانه");
        eMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        file.add(eMenuItem);
        menubar.add(file);

        JMenu contentManagement = new JMenu("مدیریت محتوا");
        contentManagement.setMnemonic(KeyEvent.VK_C);

        JMenuItem addContent = new JMenuItem("اضافه کردن محتوا", icon);
        addContent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                EventQueue.invokeLater(new Runnable() {

                    @Override
                    public void run() {
                        AddNewContent anc = new AddNewContent();
                        anc.setVisible(true);
                    }
                });
            }
        });

        JMenuItem searchContent = new JMenuItem("جستجو محتوا", icon);
        searchContent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                EventQueue.invokeLater(new Runnable() {

                    @Override
                    public void run() {
                        SearchContent sc = new SearchContent();
                        sc.setVisible(true);
                    }
                });


            }
        });

        JMenuItem createKnowledgeReq = new JMenuItem("ایجاد یک نیازمندی دانشی", icon);
        createKnowledgeReq .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                EventQueue.invokeLater(new Runnable() {

                    @Override
                    public void run() {
                        DialogCreateKnowledgeRequirement dialog_cnr = new DialogCreateKnowledgeRequirement();
                        dialog_cnr.setVisible(true);
                    }
                });

            }
        });

        JMenuItem createInterContentRelation = new JMenuItem("ایجاد رابطه بین محتوایی", icon);
        createInterContentRelation .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        contentManagement.add(addContent);
        contentManagement.add(searchContent);
        contentManagement.add(createKnowledgeReq);
        contentManagement.add(createInterContentRelation);

        menubar.add(contentManagement);

        setJMenuBar(menubar);
    }


}
