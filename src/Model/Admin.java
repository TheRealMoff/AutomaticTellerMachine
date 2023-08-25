package Model;

import java.util.ArrayList;

public class Admin {//AdminLogin class to model the attributes of an admin
    String Password;
    String Name;
    String EmployeeID;

    public Admin(String password, String Name){

        super();
    }
    public Admin(String Password, String Name, String EmployeeID) {
        this.Password = Password;
        this.Name=Name;
        this.EmployeeID = EmployeeID;

    }

    public static void add(ArrayList<Admin> admins) {
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "Password='" + Password + '\'' +
                ", Name='" + Name + '\'' +
                ", EmployeeID='" + EmployeeID + '\'' +
                '}';
    }
}
