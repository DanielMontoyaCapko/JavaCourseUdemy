public class Bank {
    private int accountNum;
    private double balance;
    private String name;
    private String email;
    private int phone;


    public void depositFounds(double deposit) {

        balance += deposit;
        System.out.println("Deposit of " + deposit + "€ made. New total deposit: " + balance);
    }

    public void withdrawFounds(double withdraw) {

        if (balance - withdraw < 0) {
            System.out.println("Not enough money on account. You have " + balance + "€");
        }
        else {
            balance -= withdraw;
            System.out.println("Withdraw of " + withdraw + "€ made. New total deposit: " + balance);
        }
    }


    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
