package com.fadel.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame{
    private JPanel panelLogin;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;
    private JButton buttonLogin;
    private JButton buttonCustomer;

    public LoginPage(){

        setTitle("Dashboard");
        setSize(250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(panelLogin);
        setVisible(true);


        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

                if (authenticate(username, password)) {
                    new DashboardWaitress();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau password Anda salah", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buttonCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CustomerPage();
                dispose();
            }
        });
    }

    private boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("adm123");
    }
}
