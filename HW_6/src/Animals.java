public class Animals {

    private String nickname;
    private String anim;
    private int run;
    private int swimming;
    private int age;


    public Animals(String nickname, int run, int swimming, int age) {
        this.nickname = nickname;
        this.run = run;
        this.swimming = swimming;
        this.age = age;
    }

    String getNickname() {
        return nickname;
    }
    int getRun() {
        return run;
    }
    int getSwimming() {
        return swimming;
    }
    int getAge() {
        return age;
    }
}