package com.fadel.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardWaitress extends JFrame {
    private JPanel panelDashboard;
    private JButton manageMenuButton;
    private JButton daftarTransaksiButton;
    private JButton buttonKembali;

    public DashboardWaitress() {
        setTitle("Dashboard");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(panelDashboard);
        setVisible(true);


        manageMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageMenu manageMenu = new ManageMenu();
                manageMenu.setVisible(true);
                dispose();
            }
        });

        daftarTransaksiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DaftarTransaksi daftarTransaksi = new DaftarTransaksi();
                daftarTransaksi.setVisible(true);

                dispose();
            }
        });

        buttonKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPage();
                dispose();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
