class Account {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(5000.75);
        System.out.println("Account Balance: " + acc.getBalance());
    }
}
