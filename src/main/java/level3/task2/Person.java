package level3.task2;

public record Person(String name, int age){

    public Person {
        if (age < 18) {
            System.out.println(name + " is underage!");
        }
    }

    public void sayHello() {
        System.out.println(name + " says hello!");
    }
}
