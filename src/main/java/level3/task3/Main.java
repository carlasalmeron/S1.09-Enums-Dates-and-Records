package level3.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing ClassMember Record ---");

        try {
            ClassMember member1 = new ClassMember("Alice", 25);
            System.out.println("Successfully created: " + member1);
        } catch (IllegalArgumentException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        try {
            System.out.println("\nTesting invalid name (null):");
            new ClassMember(null, 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        try {
            System.out.println("\nTesting invalid name (blank):");
            new ClassMember("   ", 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        try {
            System.out.println("\nTesting invalid age:");
            new ClassMember("Bob", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        ClassMember member2 = new ClassMember("Charlie", 40);
        System.out.println("\nAccessing fields of: " + member2);
        System.out.println("Name: " + member2.name());
        System.out.println("Age: " + member2.age());
    }
}
