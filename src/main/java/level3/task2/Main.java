package level3.task2;

public class Main {
    public static void main(String[] args) {

        try {
            Person p1 = new Person("Carla", 25);
            p1.sayHello();

            Person p2 = new Person("Stephania", 16);
            p2.sayHello();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
