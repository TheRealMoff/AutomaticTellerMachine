package Model;

public class Customer {

        String Name;
        String Address;
        String EmailID;
        int Contact;
        String City;
        int PinNo;
        int Balance;


        public Customer(String Name, String address, String email, Integer contact, int City,int Balance){
            super();

        }
        public Customer(String Name,String Address,String EmailID, int Contact,String City,int PinNo,int Balance) {
            this.Name=Name;
            this.Address=Address;
            this.EmailID=EmailID;
            this.Contact=Contact;
            this.City=City;
            this.PinNo=PinNo;
            this.Balance=Balance;

        }

    public Customer(String Name,String address, String email, String contact, Integer city, String names, Integer pin) {
    }

    public Customer(String Name, String address, String email, Integer contact, String city, Integer pin) {
    }

    public Customer(String name, String address, String email, int contact, String city, Integer pin) {
    }


    public static void add(Customer oneCustomer) {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int contact) {
        Contact = contact;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getPinNo() {
        return PinNo;
    }

    public void setPinNo(int pinNo) {
        PinNo = pinNo;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", EmailID='" + EmailID + '\'' +
                ", Contact=" + Contact +
                ", City='" + City + '\'' +
                ", PinNo=" + PinNo +
                ", Balance=" + Balance +
                '}';
    }
}


