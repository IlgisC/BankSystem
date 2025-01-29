import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Krijo objektin Banka dhe printo te dhenat
            Bank bank = new Bank("MyBank");
            System.out.println(bank);

            // 2. Krijo disa programues dhe printo te dhenat, llogarit bonusin ne varesi te rroges, printo tasks me renditje kohore
            Programmer programmer1 = new Programmer("John", "Doe", 50000);
            programmer1.addTask("Project 1");
            programmer1.addTask("Project 2");
            System.out.println(programmer1);
            System.out.println("Programmer 1 Tasks:");
            programmer1.printTasks();

            // 3. Krijo disa ekonomist dhe printo te dhenat, llogarit bonusin ne varesi te rroges
            Economist economist1 = new Economist("Jane", "Smith", 60000);
            System.out.println(economist1);

            // 4. Customer do te krijohen nga user - input
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

            // 5. Krijo transferta bankare nga nje user tek nje tjeter
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

