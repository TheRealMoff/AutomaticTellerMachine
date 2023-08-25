package Model;

public class Account {//Account class that contains the objects of an account
    int AccountNumber;
    String AccountType;
    int PinNo;
    int CardNo;
    int Balance;

    public Account(Integer AccountNumber, String AccountType, String CustomerID, Integer PinNo, Integer CardNo, Integer Balance){
        super();
    }
    public Account(int AccountNumber, String AccountType, String CustomerID, int PinNo, int CardNo, int Balance){
        this.AccountNumber=AccountNumber;
        this.AccountType=AccountType;
        this.PinNo=PinNo;
        this.CardNo=CardNo;
        this.Balance=Balance;
    }

    public Account(int accountnumber, String accounttype, int pin, int cardno, double balance) {
    }

    public static void add(Account account) {
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public int getPinNo() {
        return PinNo;
    }

    public void setPinNo(int pinNo) {
        PinNo = pinNo;
    }

    public int getCardNo() {
        return CardNo;
    }

    public void setCardNo(int cardNo) {
        CardNo = cardNo;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountNumber=" + AccountNumber +
                ", AccountType='" + AccountType + '\'' +
                ", PinNo=" + PinNo +
                ", CardNo=" + CardNo +
                ", Balance=" + Balance +
                '}';
    }
}
