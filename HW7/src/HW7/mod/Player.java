package HW7.mod;

public class Player {

    private int health;
    private int powerPoint;
    private int X;
    private int Y;
    private int step;

    public Player() {
        this.health = 100;
        this.step = 0;
    }

    public void setPosition(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public void  moveUp() {
        this.Y -= 1;
        ++step;
    }

    public void  moveDown() {
        this.Y += 1;
        ++step;
    }
    public void  moveLeft() {
        this.X -= 1;
        ++step;
    }
    public void  moveRight() {
        this.X += 1;
        ++step;
    }
    public void  moveRightUp() {
        this.X += 1;
        this.Y -= 1;
        ++step;
    }
    public void  moveLeftDown() {
        this.X -= 1;
        this.Y += 1;
        ++step;
    }
    public void  moveRightDown() {
        this.X += 1;
        this.Y += 1;
        ++step;
    }
    public void  moveLeftUp() {
        this.X -= 1;
        this.Y -= 1;
        ++step;
    }

    public  int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void decreaceHealth(int value) {
        this.health -= value;
    }

    public  int getHealth() {
        return health;
    }

    public  int getStep() {
        return step;
    }

    public boolean isPlayerAlive() {
        return  health > 0;
    }
}
