package level1.task3;

public class Task {
    private Level level;

    public Task(Level level) {
        this.level = level;
    }

    public void taskInfo() {
        System.out.println("Level: " + level);
        System.out.println("Color: " + level.getColor());
    }

}
