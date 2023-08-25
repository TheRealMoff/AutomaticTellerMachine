package Model;

public class Transactions {
    String TransactionsID;
    String Date;
    int AccountNumber;
    String Name;
    int Balance;


    public Transactions(String TransactionsID,String Date, int AccountNumber, String Name, int Balance){
        this.TransactionsID=TransactionsID;
        this.Date=Date;
        this.AccountNumber=AccountNumber;
        this.Name=Name;
        this.Balance=Balance;
    }

    public Transactions(String transactionsID, String date, String name, Integer accountNumber, Integer balance) {
    }

    public static void add(Transactions transactions) {
    }

    public String getTransactionsID() {
        return TransactionsID;
    }

    public void setTransactionsID(String transactionsID) {
        TransactionsID = transactionsID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }


    @Override
    public String toString() {
        return "Transactions{" +
                "TransactionsID='" + TransactionsID + '\'' +
                ", AccountNumber=" + AccountNumber +
                ", Name='" + Name + '\'' +
                ", Balance=" + Balance +
                '}';
    }
}
