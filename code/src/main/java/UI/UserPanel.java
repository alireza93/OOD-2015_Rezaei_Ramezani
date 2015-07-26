package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * @author Hamid Ramazani (mrramazani@gmail.com)
 *         Created on 7/25/2015
 */
public class UserPanel extends JFrame{
    private JButton contenPanelBtn;

    public UserPanel() throws HeadlessException {
        initUI();

        setTitle("سامانه مدیریت دانش");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        contenPanelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormMainPage formMainPage = new FormMainPage();
                formMainPage.setVisible(true);
                setVisible(false);
            }
        });
    }

    private void initUI() {

        JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon("exit.png");

        JMenu userMng = new JMenu("مدیریت پروفایل");
        userMng.setMnemonic(KeyEvent.VK_F);

        JMenuItem eMenuItem = new JMenuItem("خروج", icon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("خروج از سامانه");
        eMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });



        userMng.add(eMenuItem);
        menubar.add(userMng);

        JMenu adminMenu = new JMenu("مدیریت کاربران");
        adminMenu.setMnemonic(KeyEvent.VK_C);

        JMenuItem addContent = new JMenuItem("ایجاد کاربر", icon);
        addContent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                EventQueue.invokeLater(new Runnable() {

                    @Override
                    public void run() {
                        // TODO: AddUserDialog
//                        DialogAddNewUser anc = new DialogAddNewContent();
//                        anc.setVisible(true);
                    }
                });
            }
        });

        JMenuItem searchContent = new JMenuItem("حذف کاربر", icon);
        searchContent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                EventQueue.invokeLater(new Runnable() {

                    @Override
                    public void run() {
                        // TODO

//                        DialogSearchContent sc = new DialogSearchContent();
//                        sc.setVisible(true);
                    }
                });


            }
        });

//        JMenuItem createKnowledgeReq = new JMenuItem("ایجاد یک نیازمندی دانشی", icon);
//        createKnowledgeReq .addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//                EventQueue.invokeLater(new Runnable() {
//
//                    @Override
//                    public void run() {
////                        DialogCreateKnowledgeRequirement dialog_cnr = new DialogCreateKnowledgeRequirement();
////                        dialog_cnr.setVisible(true);
//                    }
//                });
//
//            }
//        });
//
//        JMenuItem createInterContentRelation = new JMenuItem("ایجاد رابطه بین محتوایی", icon);
//        createInterContentRelation .addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//                EventQueue.invokeLater(new Runnable() {
//
//                    @Override
//                    public void run() {
//                        DialogCreateInterContentRelation dialog_icr = new DialogCreateInterContentRelation();
//                        dialog_icr.setVisible(true);
//                    }
//                });
//
//            }
//        });

        adminMenu.add(addContent);
        adminMenu.add(searchContent);
//        adminMenu.add(createKnowledgeReq);
//        adminMenu.add(createInterContentRelation);

        menubar.add(adminMenu);

        setJMenuBar(menubar);
    }
}
