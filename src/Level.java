public enum Level {
    LEVEL1(5),
    LEVEL2(4),
    LEVEL3(3),
    LEVEL4(2),
    LEVEL5(1);

    private final int life;

    Level(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }
}

