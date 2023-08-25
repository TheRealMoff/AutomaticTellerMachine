package Controller;

import Model.*;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import View.*;
import static java.lang.Class.forName;

public class databaseConnector {


    static final String DB_URL = "jdbc:mysql://localhost:3306/atm database";

    final String USER = "root";
    final String PASS = "mswela123456789";

    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pst = null;
    ResultSet rs;

    public void databaseConnector() {
        try {
            forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            System.out.println("connected to database");

        } catch (ClassNotFoundException CNF) {
            System.out.println("ClassNotFoundException" + CNF);
        } catch (SQLException SQL) {
            System.out.println("SQLException" + SQL);
        }
    }

    public void closeDatabaseConnection() {

        try {

            conn.close();
            System.out.println("Connection Closed");
        } catch (SQLException SQL) {
            System.out.println("SQLException" + SQL);
        }
    }

    public void insertCustomer(Customer customer) {//insert customer method that inserts a new customer to the database
        databaseConnector();
        try {

            String query = "insert into customer (Name,Address,Email_ID,Contact,City,Pin_No,Balance)" + "values(?,?,?,?,?,?,?)";
            PreparedStatement preparedstmt = conn.prepareStatement(query);

            preparedstmt.setString(1, customer.getName());
            preparedstmt.setString(2, customer.getAddress());
            preparedstmt.setString(3, customer.getEmailID());
            preparedstmt.setInt(4, customer.getContact());
            preparedstmt.setString(5, customer.getCity());
            preparedstmt.setInt(6, customer.getPinNo());
            preparedstmt.setInt(7, customer.getBalance());

            preparedstmt.execute();
        } catch (SQLException SQL) {
            System.out.println("SQLException" + SQL);
        }

    }

    public List<Customer> getAllcustomers(Customer oneCustomer) {
        ArrayList<Customer> customer = new ArrayList<Customer>();

        try {
            rs = stmt.executeQuery("select * from customer");

            while (rs.next()) {

                String Name = rs.getString("Name");
                String address = rs.getString("address");
                String email = rs.getString("email");
                Integer contact = rs.getInt("contact");
                String city = rs.getString("city");
                Integer pin = rs.getInt("pin");
                Customer customer1 = new Customer(Name, address, email, contact, city, pin);
                Customer.add(oneCustomer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public void insertAccount(Account account) {
        databaseConnector();
        try {

            String query = "insert into account (Account_Number,Account_Type,Pin_No,Card_No,Balance" + "values(?,?,?,?,?)";
            PreparedStatement preparedstmt = conn.prepareStatement(query);

            preparedstmt.setInt(1, account.getAccountNumber());
            preparedstmt.setString(2, account.getAccountType());
            preparedstmt.setInt(3, account.getPinNo());
            preparedstmt.setInt(4, account.getCardNo());
            preparedstmt.setDouble(5, account.getBalance());

            preparedstmt.execute();
        } catch (SQLException SQL) {
            System.out.println("SQLException" + SQL);
        }

    }

    public List<Account> getAllaccount() {
        ArrayList<Account> accounts = new ArrayList<Account>();

        try {
            rs = stmt.executeQuery("select * from account");

            while (rs.next()) {
                Integer AccountNumber = rs.getInt("AccountNumber");
                String AccountType = rs.getString("AccountType");
                String CustomerID = rs.getString("CustomerID");
                Integer PinNo = rs.getInt("PinNo");
                Integer CardNo = rs.getInt("CardNo");
                Integer Balance = rs.getInt("Balance");
                Account account = new Account(AccountNumber, AccountType, CustomerID, PinNo, CardNo, Balance);
                Account.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void insertTransaction(Transactions transactions) {
        try {

            String query = "insert into transactions (Transactions_ID,Date,Account_Number,Name, Balance" + "values(?,?,?,?,?)";
            PreparedStatement preparedstmt = conn.prepareStatement(query);

            preparedstmt.setString(1, transactions.getTransactionsID());
            preparedstmt.setString(2, transactions.getDate());
            preparedstmt.setInt(3, transactions.getAccountNumber());
            preparedstmt.setString(4, transactions.getName());
            preparedstmt.setDouble(5, transactions.getBalance());

            preparedstmt.execute();
        } catch (SQLException SQL) {
            System.out.println("SQLException" + SQL);
        }
    }

    public List<Transactions> getAllTransactions(Transactions transactions) {
        ArrayList<Transactions> transaction = new ArrayList<Transactions>();

        try {
            rs = stmt.executeQuery("select * from transactions");

            while (rs.next()) {
                String TransactionsID = rs.getString("TransactionsID");
                String Date = rs.getString("Date");
                String Name = rs.getString("Name");
                Integer AccountNumber = rs.getInt("AccountNumber");
                Integer Balance = rs.getInt("Balance");
                Transactions transactions1 = new Transactions(TransactionsID, Date, Name, AccountNumber, Balance);
                Transactions.add(transactions1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transaction;
    }

    public void insertBank(Bank bank) {
        try {

            String query = "insert into bank (Branch_Code,Bank_Name,Bank_Address," + "values(?,?,?)";
            PreparedStatement preparedstmt = conn.prepareStatement(query);

            preparedstmt.setString(1, bank.getBranchCode());
            preparedstmt.setString(2, bank.getBankName());
            preparedstmt.setString(3, bank.getBankAddress());

            preparedstmt.execute();
        } catch (SQLException SQL) {
            System.out.println("SQLException" + SQL);
        }
    }

    public List<Bank> getAllBanks() {
        ArrayList<Bank> bank = new ArrayList<Bank>();

        try {
            rs = stmt.executeQuery("select * from bank");

            while (rs.next()) {
                String BranchCode = rs.getString("BranchCode");
                String BankName = rs.getString("AccountNumber");
                String BankAddress = rs.getString("BankAddrress");
                Bank bank1 = new Bank(BranchCode, BankName, BankAddress);
                Bank.add(bank1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bank;
    }

    public void insertAdmin(Admin admin) {
        databaseConnector();
        try {

            String query = "insert into admin (Name,Employee_ID,Password)" + "values(?,?,?)";
            PreparedStatement preparedstmt = conn.prepareStatement(query);

            preparedstmt.setString(1, admin.getName());
            preparedstmt.setString(2, admin.getEmployeeID());
            preparedstmt.setString(3, admin.getPassword());

            preparedstmt.execute();
        } catch (SQLException SQL) {
            System.out.println("SQLException" + SQL);
        }
    }

    public List<Admin> getAllAdmins() {
        ArrayList<Admin> admins = new ArrayList<Admin>();

        try {
            rs = stmt.executeQuery("select * from admin");

            while (rs.next()) {
                String Name = rs.getString("Name");
                String EmployeeID = rs.getString("Employee");
                String Password = rs.getString("Password");
                Admin admin = new Admin(Name, EmployeeID, Password);
                Admin.add(admins);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admins;
    }

    public void getData(String EmployeeID, String password) {

        JPasswordField passwordField1 = null;
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;

        JTextField EmployeeIDField1 = null;

        databaseConnector();
        if (EmployeeID.equals("") && password.equals("")) {
            JOptionPane.showMessageDialog(null, "Username and password required");
        } else {
            try {
                forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                pst = conn.prepareStatement("Select * from admin where Employee_ID=? and Password=?");

                pst.setString(1, EmployeeID);
                pst.setString(2, password);

                rs = pst.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed!");
                    passwordField1.setText("");
                    EmployeeIDField1.setText("");
                    EmployeeIDField1.requestFocus();
                    ;
                }


            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }


        }

    }

    public void getCustomerData(String Name, Integer password) {

        JPasswordField passwordTXT = null;
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;

        JTextField UsernameTXT = null;

        databaseConnector();
        if (Name.equals("") && password.equals("")) {
            JOptionPane.showMessageDialog(null, "Name and password required");
        } else {
            try {
                forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                pst = conn.prepareStatement("Select * from customer where Name=? and Pin_No=?");

                pst.setString(1, Name);
                pst.setInt(2, Integer.parseInt(String.valueOf(password)));

                rs = pst.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed!");
                    passwordTXT.setText("");
                    UsernameTXT.setText("");
                    UsernameTXT.requestFocus();
                    ;
                }


            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }


        }

    }


    public void withdrawal() {
        databaseConnector();
        MainScreen mc= new MainScreen();
try {

    try {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM customer WHERE Pin_No ='" + mc.textFieldPin.getText() + "'");

        while (rs.next()) {
           JOptionPane.showMessageDialog(null, "The Minimum cash you can withdraw is 10", "ATM", JOptionPane.INFORMATION_MESSAGE);

           mc.textFieldAvail.setText(rs.getString(7));
           int a = Integer.parseInt(mc.textFieldAvail.getText());
           int b = Integer.parseInt(mc.textFieldOwnAmount.getText());


           if (a < b) {

               JOptionPane.showMessageDialog(null, "Transaction cannot process", "ATM", JOptionPane.INFORMATION_MESSAGE);
               mc.textFieldOwnAmount.setText("");

           } else {
               if (b < 10) {
                   JOptionPane.showMessageDialog(null, "The Minimum cash you can withdraw is 10", "ATM", JOptionPane.INFORMATION_MESSAGE);

               } else {

                   int value = a - b;

                   mc.textFieldAvail.setText((value + ""));
                   mc.textFieldOwnAmount.setText("");
                   JOptionPane.showMessageDialog(null, "You WithDraw " + b, "ATM", JOptionPane.INFORMATION_MESSAGE);
                   //pst = conn.prepareStatement("UPDATE customer SET balance = '" + txtPass.getText() + "',ct = '" + value +  "'WHERE pin = '" + passwordField1.getText() + "'");pst.executeUpdate();passwordField1.requestFocus(true);
                   pst = conn.prepareStatement("UPDATE customer set Balance = '" + mc.textFieldAvail.getText() + "'WHERE AccountNumber = '" + mc.textFieldPin.getText() + "'");
                   pst.executeUpdate();
                   mc.textFieldPin.requestFocus(true);
               }
           }
       }
        stmt.close();
    } catch (NumberFormatException | SQLException nfe) {
        JOptionPane.showMessageDialog(null, "Enter now the amount to withdraw", "ATM", JOptionPane.INFORMATION_MESSAGE);

    }
    } catch (HeadlessException e) {
    e.printStackTrace();
     }


    }
    public String getCustomers(){
        Connection conn = null;
        PreparedStatement pst;
        ResultSet rs;

        String view= new String();
        try{
            pst = conn.prepareStatement("Select * FROM customer");
            rs = pst.executeQuery();
            while(rs.next()){
                Customer customer= new Customer(rs.getString("Name"),rs.getString("address"),rs.getString("email"),rs.getInt("contact"),rs.getString("city"),rs.getInt("pin"),rs.getInt("balance"));
                view = view +customer.toString()+"\n";
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return view;
    }

}


