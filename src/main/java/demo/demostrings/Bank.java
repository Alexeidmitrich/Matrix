package demo.demostrings;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bank implements Serializable{
    String title;
    String address;
    Director director;
    ArrayList<Person> people = new ArrayList<Person>();

    public Bank(String title, String address, Director director, ArrayList<Person> people) {
        this.title = title;
        this.address = address;
        this.director = director;
        this.people = people;
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

    @Override
    public String toString() {
        return "Bank{" +
                "title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", director=" + director +
                ", people=" + people +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Director director = new Director("Ivan", "Gorshkov");
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Ivan", "Pupkin", 30000));
        people.add(new Person("Ivans", "Pupkinis", 45000));
        Bank bank = new Bank("Opel", "Sankt-Petersburg", director, people);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BankObject.ser"));
            oos.writeObject(bank);
            //oos.writeObject(people);
            System.out.println("Done");
            oos.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("BankObject.ser"));
        bank = (Bank) objectInputStream.readObject();
        //people = (ArrayList<Person>) objectInputStream.readObject();
        System.out.println(bank);
        //System.out.println(people);
        objectInputStream.close();
    }
}

    class Director implements Serializable{
        String firstName;
        String secondName;

        public Director(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }

        @Override
        public String toString() {
            return "Director{" +
                    "firstName='" + firstName + '\'' +
                    ", secondName='" + secondName + '\'' +
                    '}';
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

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", secondName='" + secondName + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

