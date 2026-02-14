package level3.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> students = List.of(
            new Person("Carla", 17),
            new Person("Jose", 20),
            new Person("Juan", 17),
            new Person("Sofia", 18)
            );

        System.out.println("Underage students: ");
        students.stream()
                .filter(person -> person.age() >= 18)
                .forEach(System.out::println);
    }
}
