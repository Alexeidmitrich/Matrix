package demo;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Person {
    int id;
    Date birthday;
    String name;

    public Person(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person("Bob");
        Person p1 = new Person("Bob");
         if(p.equals(p1)){ // ==
             // равно проверяет это один и тот же объект или два разных, а иквалс проверяет содержимое объекта
             // но изначально они работают одинаково
            System.out.println("A");
        }
         Set<Person> set = new HashSet<>();
         //структура данных которая не содержит дупликат
        set.add(p);
        set.add(p1);
        System.out.println(set.size());
        System.out.println(set.stream().collect(Collectors.toList()));

    }
}
