package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanel extends JFrame{
    public JButton VIEWCUSTOMERButton;
    public JButton ADDCUSTOMERButton;
    public JPanel JContentPane;

    public AdminPanel(){
        add(JContentPane);

        ADDCUSTOMERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddCustomer customer=new AddCustomer();
                customer.setTitle("Add Customer");
                customer.setLocationRelativeTo(null);
                customer.setSize(350,350);
                customer.pack();
                customer.setVisible(true);
                //customer.dispose();
            }
        });
        VIEWCUSTOMERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewCustomers viewCustomer= new ViewCustomers();
                viewCustomer.setTitle("View Customers");
                viewCustomer.setLocationRelativeTo(null);
                viewCustomer.setSize(350,350);
                viewCustomer.pack();
                viewCustomer.setVisible(true);
                //viewCustomer.dispose();
            }
        });
    }
}
