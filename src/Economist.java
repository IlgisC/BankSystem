// Economist class
public class Economist extends Person implements Employee {
    double salary;

    public Economist(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1; // 10% of salary
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}