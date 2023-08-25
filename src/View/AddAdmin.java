package View;

import Controller.databaseConnector;
import Model.Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddAdmin extends JFrame{
    public JLabel nameLabel;
    public JLabel employeeIDLabel;
    public JLabel passwordLabel;
    public JTextField NametextField;
    public JTextField EmIDtextField;
    public JButton bSubmit;
    public JPasswordField passwordField1;
    private JPanel JContentPane;

    public AddAdmin(){
        add(JContentPane);
        bSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Password=passwordField1.getText();
                String Name= NametextField.getText();
                String EmployeeID=EmIDtextField.getText();

                System.out.println(Password+"\n"+
                        Name+"\n"+
                        EmployeeID);
                Admin admins=new Admin(Password,Name,EmployeeID);

                databaseConnector databaseConnector= new databaseConnector();
                databaseConnector.insertAdmin(admins);
                databaseConnector.closeDatabaseConnection();


            }
        });
    }


}
