import java.util.Objects;

public class TeamIJ extends Team {
    private String name;
    private double speedB;
    private double speedR;
    private double jamp;
    private int age;

    public TeamIJ(String name, double speedB, double speedR, double jamp, int age) {

        this.name = name;
        this.speedB = speedB;
        this.speedR = speedR;
        this.jamp = jamp;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSpeedB() {
        return speedB;
    }

    private void setSpeedB(double speedB) {
        this.speedB = speedB;
    }

    public double getSpeedR() {
        return speedR;
    }

    private void setSpeedR(double speedR) {
        this.speedR = speedR;
    }

    public double getJamp() {
        return jamp;
    }

    public void setJamp(double jamp) {
        this.jamp = jamp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}