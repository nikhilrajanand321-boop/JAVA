class BankAccount {
    private String name;
    private double balance;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setName("Nikhil");
        account.setBalance(5000);

        System.out.println(account.getName());
        System.out.println(account.getBalance());
    }
}