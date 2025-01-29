// Customer class
public class Customer extends Person {
    double balance;

    public Customer(String name, String surname, double balance) {
        super(name, surname);
        this.balance = balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void transfer(Customer recipient, double amount) {
        if (balance >= amount) {
            debit(amount);
            recipient.credit(amount);
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Balance: " + balance;
    }
}


