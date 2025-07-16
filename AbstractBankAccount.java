abstract class BankAccount {
    abstract void calculateInterest();
}

class SavingsAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Interest for savings account: 4%");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.calculateInterest();
    }
}
