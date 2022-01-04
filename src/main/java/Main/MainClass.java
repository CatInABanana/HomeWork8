package Main;

public class MainClass {

    public static void main(String[] args) {

        Runnable[] participants = new Runnable[6];
        participants[0] = new Human("Алина", 2000, 1.2);
        participants[1] = new Human("Вадим", 3000, 1);
        participants[2] = new Cat("Васька", 300, 4);
        participants[3] = new Cat("Мурка" , 350, 3.5);
        participants[4] = new Robot("Прототайп" , 10000, 0.1);
        participants[5] = new Robot( "Джек", 600, 15);

        Competition[] competitions = new Competition[2];
        competitions[0] = new Treadmill(330);
        competitions[1] = new Wall(2.1);

        for (var participant : participants){
            for (var competition : competitions){
                participant.doCompetition(competition);
                if (participant.isPassed()){
                    System.out.println("Участник " + participant.getName() + " проходит дальше");
                } else {
                    System.out.println("Участник " + participant.getName() + " выбывает");
                    break;
                }
            }
            System.out.println("");
        }

    }

}
