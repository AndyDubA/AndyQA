class Cats extends Animals {

    private String nickname;
    private static final int swimming = 0;
    private static final String anim = "cat";


    public Cats(String nickname, int run, int swimming, int age) {
        super (nickname, run, swimming, age);
            this.nickname = nickname;
    }

    String getNickname() {
          return nickname;
    }
    int swimming() {
         return swimming;
    }
}