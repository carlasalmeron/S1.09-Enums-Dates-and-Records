package level3.task2;

public record Person(String name, int age){

    public Person {

        if (age < 18) {
            throw new IllegalArgumentException(name + " must be at least 18 years old");
        }
    }

    public void sayHello() {
        System.out.println(name + " says hello!");
    }
}
