package Model;

public class Bank {
    String BranchCode;
    String BankName;
    String BankAddress;



    public Bank(String BranchCode, String BankName, String BankAddress){
        this.BranchCode=BranchCode;
        this.BankName=BankName;
        this.BankAddress=BankAddress;
    }
    public static void add(Bank bank) {
    }

    public String getBranchCode() {

        return BranchCode;
    }

    public void setBranchCode(String branchCode) {

        BranchCode = branchCode;
    }

    public String getBankName() {

        return BankName;
    }

    public void setBankName(String bankName) {

        BankName = bankName;
    }

    public String getBankAddress() {

        return BankAddress;
    }

    public void setBankAddress(String bankAddress) {

        BankAddress = bankAddress;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "BranchCode='" + BranchCode + '\'' +
                ", BankName='" + BankName + '\'' +
                ", BankAddress='" + BankAddress + '\'' +
                '}';
    }
}
