package View;

import Controller.databaseConnector;
import Model.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewCustomers extends JFrame{
    public JLabel CUSTOMERSLabel;
    public JButton bDisplay;
    public JPanel JContentPane;
    public JTextArea textAreaPin;
    public JButton bBack;
    public JTextArea textAreaName;
    public JTextArea textAreaAddress;
    public JTextArea textAreaEmail;
    public JTextArea textAreaContact;
    public JTextArea textAreaCity;
    public JLabel NAMELabel;
    public JLabel ADDRESSLabel;
    public JLabel EMAILLabel;
    public JLabel CONTACTLabel;
    public JLabel CITYLabel;
    public JLabel PINLabel;
    public JTextArea textAreaBalance;
    public JLabel balanceLabel;

    public ViewCustomers(){

        add(JContentPane);

        bDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textAreaName.getText();
                String address = textAreaAddress.getText();
                String email = textAreaEmail.getText();
                Integer contact = Integer.valueOf(textAreaContact.getText());
                String city = textAreaCity.getText();
                Integer pin = Integer.valueOf(textAreaPin.getText());
                Integer balance = Integer.valueOf(textAreaBalance.getText());

                System.out.println();
                Customer oneCustomer = new Customer(name, address, email, contact, city,pin,balance);

                databaseConnector databaseConnector = new databaseConnector();
                databaseConnector.getCustomers();
                databaseConnector.closeDatabaseConnection();

            }
        });
        bBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddCustomer customer=new AddCustomer();
                customer.setTitle("Add Customer");
                customer.setLocationRelativeTo(null);
                customer.setSize(350,350);
                customer.setVisible(true);
            }
        });
    }

}
