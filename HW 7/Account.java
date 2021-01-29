// Class to create objects with the attributes of fullName and accountNum

public abstract class Account {
    protected String fullName;
    protected int accountNum;

    public Account() { // Default constructor
        fullName = "John Doe";
        accountNum = 1;
    }

    public Account(String fullName, int accountNum) { // Non-default Constructor
        this.fullName = fullName;
        this.accountNum = accountNum;
    }

    public void setFullName(String fullName) { // Setter Method for fullName
        this.fullName = fullName;
    }

    public String fullName() { // Getter Method for fullName
        return fullName;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public int accountNum(){
        return accountNum;
    }

    abstract double calculateSales();

    public String toString() { // toString method for showing name and account number
        return("Account Number: " + accountNum + " Name: " + fullName );
    }
}