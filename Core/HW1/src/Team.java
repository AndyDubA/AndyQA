public class Team {

    protected double speedB;
    protected double speedR;
    protected double jamp;

    public static void main(String[] args) {

        final String nameTeam = "LidlTEAM";

        final double timeB = 0.6; //время прохождения велосипедной дистанции для зачета
        final double timeR = 0.03; //время прохождения беговой дистанции для зачета

        TeamIJ[] teamij = new TeamIJ[4];
        teamij[0] = new TeamIJ("Ivan", 20.9, 15.1, 3.1, 20);
        teamij[1] = new TeamIJ("Anrew", 23.8, 12.6, 2.8, 27);
        teamij[2] = new TeamIJ("Lera", 21.2, 14.5, 2.7, 16);
        teamij[3] = new TeamIJ("Anna", 18.9, 22.3, 2.1, 23);

        System.out.println("Команда: " + nameTeam);

        for (int i = 0; i < teamij.length; i++) {
            System.out.println("Участник №" + (i + 1) + " по имени " + teamij[i].getName() + " возрастом " + teamij[i].getAge());
        }

        for (int i = 0; i < teamij.length; i++) {

            if ((Course.getMjamp() - teamij[i].getJamp()) > 0){
                System.out.println("Участником " + teamij[i].getName() + " прыжок покорен");
            }

            if ((Course.getDistanceBike() / teamij[i].getSpeedB()) < timeB){
                System.out.println("Участником " + teamij[i].getName() + " велогонка пройдена");
            }

            if ((Course.getDistanceRun() / teamij[i].getSpeedR()) < timeR){
                System.out.println("Участником " + teamij[i].getName() + " дистанция покорена");
            }
        }
    }

}