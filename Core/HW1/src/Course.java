public class Course extends Team {


    private static int mjamp = 3;
    private static double distanceRun = 0.4;
    private static int distanceBike = 11;

    public static int getMjamp() {
        return mjamp;
    }
    public static double getDistanceRun() {
        return distanceRun;
    }
    public static int getDistanceBike() {
        return distanceBike;
    }

    protected static double bike;
    protected static double run;
    protected static double jampUp;

    public double bike(Team TeamIJ) {
        double timeBike = distanceBike / TeamIJ.speedB;
        System.out.println(timeBike);
        return timeBike;
    }

    public double run(Team TeamIJ) {
        double timeRun = distanceRun / TeamIJ.speedR;
        System.out.println(timeRun);
        return timeRun;
    }

    public double jampUp(Team TeamIJ) {
        double resJamp = mjamp / TeamIJ.jamp;
        System.out.println(resJamp);
        return resJamp;
    }

    public static double getBike() {
        return bike;
    }

    public static double getRun() {
        return run;
    }

    public static double getJampUp() {
        return jampUp;
    }



}
