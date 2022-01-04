package Main;

public class Human implements Runnable {

    private String name;
    private double maxDist;
    private double maxHeight;
    private boolean passed;

    public Human (String name, double maxDist, double maxHeight) {
        this.name = name;
        this.maxDist = maxDist;
        this.maxHeight = maxHeight;
        passed = false;
    }

    @Override
    public boolean isPassed() {
        return passed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void doCompetition(Competition competition) {
        Runnable.super.doCompetition(competition);
    }

    @Override
    public void run(double dist) {

        if (dist <= maxDist) {
            System.out.println("Человек " + name + " пробежал " + dist + " метров");
            passed = true;
        } else System.out.println("Человек " + name + " не смог пробежать " + dist + " метров");
    }

    @Override
    public void jump(double height) {
        if (height <= maxHeight) {
            System.out.println("Человек " + name + " подпрыгнул на " + height + " метров");
            passed = true;
        } else System.out.println("Человек " + name + " не смог подпрыгнуть на " + height + " метров");
    }
}
