package View;

import Controller.databaseConnector;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerLogin extends JFrame{
    public JLabel LOGINLabel;
    public JPasswordField passwordTXT;
    public JTextField UsernameTXT;
    public JPanel JContentPane;
    public JLabel passwordLabel;
    public JLabel userNameLabel;
    private JButton bOk;
    public JButton bCancel;
    private JPanel CustomerPane;
    private JButton bLogOut;

    public CustomerLogin(){
        add(JContentPane);

        bOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer password=Integer.parseInt(passwordTXT.getText());
                String username=UsernameTXT.getText();
                
                System.out.println(password+"\n"+
                        username);
                CustomerLogin customer=new CustomerLogin(username,password);
                
                databaseConnector databaseConnector=new databaseConnector();
                databaseConnector.getCustomerData(username,password);
                databaseConnector.closeDatabaseConnection();

                MainScreen MainForm=new MainScreen();
                MainForm.setVisible(true);
                MainForm.setSize(350,350);
                dispose();


            }
        });
        bCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        bLogOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomeScreen welcomeScreen=new WelcomeScreen();
                welcomeScreen.setVisible(true);
                welcomeScreen.setSize(350,350);
                dispose();
            }
        });
    }

    public CustomerLogin(String username, Integer password) {
    }
}
