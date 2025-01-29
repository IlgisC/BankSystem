import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Create the Bank object and print the data.
            Bank bank = new Bank("MyBank");
            System.out.println(bank);

            // 2. Create some schedules and print the data, calculate the bonus depending on the salary, print tasks in chronological order
            Programmer programmer1 = new Programmer("John", "Doe", 50000);
            programmer1.addTask("Project 1");
            programmer1.addTask("Project 2");
            System.out.println(programmer1);
            System.out.println("Programmer 1 Tasks:");
            programmer1.printTasks();

            // 3. Create some economists and print the data, calculate the bonus depending on the salary
            Economist economist1 = new Economist("Jane", "Smith", 60000);
            System.out.println(economist1);

            // 4. Customers will be created by user - input
            System.out.println("Are you registered? (yes/no)");
            String registered = scanner.nextLine();
            if (registered.equalsIgnoreCase("no")) {
                System.out.println("Do you want to register? (yes/no)");
                String registerChoice = scanner.nextLine();
                if (registerChoice.equalsIgnoreCase("yes")) {
                    // Implement customer registration process
                }
            } else {
                // Implement registered user actions
            }

            // 5. Create bank transfers from one user to another
            Customer sender = new Customer("Alice", "Johnson", 1000);
            Customer recipient = new Customer("Bob", "Smith", 500);
            double transferAmount = 200;
            sender.transfer(recipient, transferAmount);
            System.out.println(sender);
            System.out.println(recipient);
        }

        @Override
        public String toString() {
            String name = null;
            String surname = null;
            return "Name: " + name + ", Surname: " + surname;
        }
    }

