import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    abstract class Person {
        String name;
        String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Surname: " + surname;
        }
    }

    // Employee interface
    interface Employee {
        double calculateBonus();
    }

    // Economist class
    class Economist extends Person implements Employee {
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

    // Customer class
    class Customer extends Person {
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
    }

