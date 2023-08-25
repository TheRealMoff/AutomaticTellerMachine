package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame{
    public JLabel WELCOMELabel;
    public JButton bAdmin;
    public JButton bCustomer;
    public JPanel JContentPane;

    public WelcomeScreen(){

        add(JContentPane);
        bCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CustomerLogin customerLogin= new CustomerLogin();
                customerLogin.setVisible(true);
                customerLogin.setSize(350,350);
                dispose();


            }
        });
        bAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminLogin adminLogin= new AdminLogin();
                adminLogin.setVisible(true);
                adminLogin.setSize(350,350);
                dispose();
            }
        });
    }

}
