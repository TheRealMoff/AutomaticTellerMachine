package View;

import Controller.databaseConnector;
import Model.Account;
import Model.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCustomer extends JFrame {
    public JPanel JContentPane;
    public JTextField textFieldName;
    public JTextField textFieldAddress;
    public JTextField textFieldEmailID;
    public JTextField textFieldContact;
    public JTextField textFieldPinNo;
    public JTextField textFieldCity;
    public JButton bSubmit;
    public JButton bCancel;
    public JLabel nameLabel;
    public JLabel addressLabel;
    public JLabel emailIDLabel;
    public JLabel contactLabel;
    public JLabel pinNoLabel;
    public JLabel cityLabel;
    public JButton bLogOut;
    public JLabel balanceLabel;
    public JTextField textFieldBalance;

    public AddCustomer() {

        add(JContentPane);
        bSubmit.addActionListener(new ActionListener() {//this button submits the newly added customer to the database
            @Override
            public void actionPerformed(ActionEvent e) {
                String Name = textFieldName.getText();
                String address = textFieldAddress.getText();
                String email = textFieldEmailID.getText();
                int contact = Integer.parseInt(textFieldContact.getText());
                int PIN = Integer.parseInt(textFieldPinNo.getText());
                String city = textFieldCity.getText();
                int balance = Integer.parseInt(textFieldBalance.getText());


                System.out.println(Name+"\n" +
                        address+"\n"+
                        email+"\n"+
                        contact+"\n"+
                        city+"\n"+
                        PIN);
                Customer oneCustomer = new Customer(Name, address, email, contact, city,PIN,balance);

                databaseConnector databaseConnector=new databaseConnector();
                databaseConnector.insertCustomer (oneCustomer);
                databaseConnector.closeDatabaseConnection();
            }
        });

        bCancel.addActionListener(new ActionListener() {//cancel button to clear all fields entered
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldName.setText("");
                textFieldAddress.setText("");
                textFieldEmailID.setText("");
                textFieldContact.setText("");
                textFieldPinNo.setText("");
                textFieldCity.setText("");
                textFieldBalance.setText("");
                bCancel.addActionListener(this);
            }
        });
        bLogOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomeScreen welcomeScreen=new WelcomeScreen();//Instance of the welcome screen form to open the form
                welcomeScreen.setVisible(true);
                welcomeScreen.setSize(350,350);
                dispose();
            }
        });
    }

}