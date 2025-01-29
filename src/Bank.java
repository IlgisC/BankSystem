import java.util.ArrayList;
import java.util.List;

// Bank class
public class Bank {
    String name;
    List<Programmer> programmerList;
    List<Economist> economistList;
    List<Customer> customerList;

    public Bank(String name) {
        this.name = name;
        this.programmerList = new ArrayList<>();
        this.economistList = new ArrayList<>();
        this.customerList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Bank Name: " + name;
    }
}