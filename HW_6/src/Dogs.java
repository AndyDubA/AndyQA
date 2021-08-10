class Dogs extends Animals {

        private String nickname;
        private static final String anim = "Dog";


    public Dogs(String nickname, int run, int swimming, int age) {
        super(nickname, run, swimming, age);
        this.nickname = nickname;
    }

    String getNickname() {
        return nickname;
    }
}