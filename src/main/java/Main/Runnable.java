package Main;

public interface Runnable {

    boolean isPassed();
    String getName();

    default void doCompetition(Competition competition) {
        if ("Treadmill".equals(competition.getType())) {
            run(competition.metric);
            if (isPassed()) {
                System.out.println("Участник прошёл испытание.");
            } else {
                System.out.println("Участник не прошёл испытание");
            }
        } else if ("Wall".equals(competition.getType())){
            jump(competition.metric);
            if (isPassed()) {
                System.out.println("Участник прошёл испытание.");
            } else {
                System.out.println("Участник не прошёл испытание");
            }
        }
    }
    void run(double dist);
    void jump(double height);

}
