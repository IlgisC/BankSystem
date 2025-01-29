import java.util.ArrayList;
import java.util.List;

// Programmer class
class Programmer extends Person implements Employee {
    double salary;
    List<String> listOfTasks;

    public Programmer(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
        this.listOfTasks = new ArrayList<>();
    }

    @Override
    public double calculateBonus() {
        return salary * 0.05; // 5% of salary
    }

    public void addTask(String task) {
        listOfTasks.add(task);
    }

    public void printTasks() {
        // Implement sorting tasks by time spent
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}