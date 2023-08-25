package View;

import Controller.databaseConnector;
import Model.Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin extends JFrame{
    public JLabel ADMINLOGINLabel;
    public JLabel userNameLabel;
    public JPasswordField passwordField1;
    public JPanel JContentPane;
    public JButton bOk;
    public JButton bLogOut;
    public JTextField EmployeeIDField1;

    public AdminLogin(){

        add(JContentPane);
        bOk.addActionListener(new ActionListener(){//button ok to initiate login into the system
            @Override
            public void actionPerformed(ActionEvent e){
                String password=passwordField1.getText();
                String EmployeeID=EmployeeIDField1.getText();

                System.out.println(password+"\n"+
                        EmployeeID);

                Admin admin=new Admin(password,EmployeeID);

                databaseConnector databaseConnector=new databaseConnector();
                databaseConnector.getData(EmployeeID,password);
                databaseConnector.closeDatabaseConnection();

                AdminPanel adminPanel = new AdminPanel();
                adminPanel.setVisible(true);
                adminPanel.setSize(350,350);
                dispose();

                /*AddCustomer addCustomer=new AddCustomer();
                addCustomer.setVisible(true);
                dispose();*/
            }
        });
        bLogOut.addActionListener(new ActionListener() {//button logout to take the admin to the welcome screen
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomeScreen welcomeScreen=new WelcomeScreen();
                welcomeScreen.setVisible(true);
                welcomeScreen.setSize(350,350);
                dispose();
            }
        });
    }

    }


