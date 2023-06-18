package demo.demostrings;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    String title;
    String address;
    Director director;
    List <Person> personList = new ArrayList<>();

    public Bank(String title, String address, Director director, List<Person> personList) {
        this.title = title;
        this.address = address;
        this.director = director;
        this.personList = personList;
    }

    public Bank(String title, String address, Director director) {
        this.title = title;
        this.address = address;
        this.director = director;
    }

    public Bank(String title, String address) {
        this.title = title;
        this.address = address;
    }

    public static void main(String[] args) {
        Director director = new Director("Ivan", "Gorshkov");
        List<Person> personList = new ArrayList<>();
        Person per = new Person("Ivan", "Pupkin", 30000);
        Person per1 = new Person("Ivans", "Pupkinis", 45000);
        personList.add(per);
        personList.add(per1);
        Bank bank = new Bank("Opel", "Sankt-Petersburg", director, personList);
        try {
            FileOutputStream fos = new FileOutputStream("BankObject.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bank);
            System.out.println("Done");
            oos.close();
            fos.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

    class Director implements Serializable{
        String firstName;
        String secondName;

        public Director(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }
    }

    class Person implements Serializable {
        String firstName;
        String secondName;
        int salary;

        public Person(String firstName, String secondName, int salary) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.salary = salary;
        }
    }

