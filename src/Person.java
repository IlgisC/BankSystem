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