package View;

public class Main {
    public static void main(String[] args){
        WelcomeScreen welcomeScreen= new WelcomeScreen();
        welcomeScreen.setTitle("Welcome");
        welcomeScreen.setLocationRelativeTo(null);
        welcomeScreen.pack();
        welcomeScreen.setVisible(true);
        welcomeScreen.setSize(350,350);

        AdminLogin adminLogin= new AdminLogin();
        adminLogin.setTitle("Login");
        adminLogin.setLocationRelativeTo(null);
        adminLogin.pack();

        MainScreen MainForm=new MainScreen();
        MainForm.setTitle("Main");
        MainForm.setLocationRelativeTo(null);
        MainForm.pack();
        MainForm.setSize(500,200);
        //MainForm.setVisible(true);

        AddCustomer customer=new AddCustomer();
        customer.setTitle("Add Customer");
        customer.setLocationRelativeTo(null);
        customer.pack();
        //customer.setVisible(true);


        //adminLogin.setVisible(true);

        CustomerLogin customerLogin= new CustomerLogin();
        customerLogin.setTitle("Customer LogIn");
        customerLogin.setLocationRelativeTo(null);
        customerLogin.pack();
        //customerLogin.setVisible(true);

        ViewCustomers viewCustomer= new ViewCustomers();
        viewCustomer.setTitle("View Customers");
        viewCustomer.setLocationRelativeTo(null);
        viewCustomer.pack();
        //viewCustomer.setVisible(true);

        AddAdmin admin=new AddAdmin();
        admin.setTitle("Add Employee");
        admin.setLocationRelativeTo(null);
        admin.pack();
        //admin.setVisible(true);*/

        AdminPanel adminPanel = new AdminPanel();
        //adminPanel.setVisible(true);
        adminPanel.setSize(350,350);
       //adminPanel.dispose();
    }
}
