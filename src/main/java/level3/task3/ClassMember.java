package level3.task3;

public record ClassMember(String name, int age) {

    public ClassMember {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("The age cannot be negative");
        }
    }
}
