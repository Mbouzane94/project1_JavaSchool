public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    public void debit(double withdrawAmount) {
        if (withdrawAmount < balance) {
            balance -= withdrawAmount;
        } else {
            System.out.print("Insufficent Funds");
        }
    }

    public void reset() {
        setBalance(0.00);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
