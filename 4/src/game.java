import java.util.Random;
import java.util.Scanner;

public class game {

    public static int mapMax = 6;
    public static int mapMin = 2;
    public static int mHe;
    public static int mWi;
    public static char cremap[][];

    public static int posPlx;
    public static int posPly;
    public static Scanner scanner = new Scanner(System.in);
    public static int playerHealth= 100;

    //movepl
    public static final int moveU = 8;
    public static final int moveD = 2;
    public static final int moveL = 4;
    public static final int moveR = 6;

    public static char pustmap = '_';
    public static char playerV = 'Ж';
    public static char step = '*';


    public static void main(String[] args) {
        cmap();
        player();
        while (true) {
            gameCycle();
        }
        //       if (step == cremap[i][j]) { //не создано условие для конца игры
        //      System.out.println("Fin");
        //}
        //}
    }

    public static void gameCycle() {
        printmap();
        motion();
    }

    public static void cmap() {
        mHe = randomRange(mapMin, mapMax);
        mWi = randomRange(mapMin, mapMax);
        cremap = new char[mHe][mWi];
        for (int i = 0; i < mHe ; i++) {
            for (int j = 0 ; j < mWi ; j++){
                cremap[i][j] = pustmap;
            }
        }
        System.out.println("New game map = " + mHe + "x" + mWi);
    }

    public static void printmap() {
        for (int i = 0; i < mHe; i++) {
            System.out.print((i) + "  ");
            for (int j = 0; j < mWi; j++) {
                System.out.print(cremap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void player() {
        posPlx = mHe / 2;
        posPly = mWi / 2;
        cremap[posPlx][posPly] = playerV;
        System.out.println("Posithion Pl "+ posPlx +"x" + posPly); //отображение игрока и фактическое положение не соответсвтвуют друг другу
    }

        public static void motion() {
        int currentX = posPlx;
        int currentY = posPly;

        int playerMove;

        do {
            System.out.print("Enter your move (UP=" + moveU +
                    " DOWN=" + moveD +
                    " LEFT=" + moveL +
                    " RIGHT=" + moveR  + ")----> ");

            playerMove = scanner.nextInt();

            switch (playerMove) {
                case moveL:
                    posPlx -= 1;
                    break;
                case moveR:
                    posPlx += 1;
                    break;
                case moveU:
                    posPly -= 1;
                    break;
                case moveD:
                    posPly += 1;
                    break;
            }
        } while (!isValidNextMove(currentY, currentX, posPly, posPlx));
        nextMove(currentY, currentX, posPlx, posPly);

    }

    public static boolean isValidNextMove(int currentY, int currentX, int nextY, int nextX) {
        if (nextY >= 0 && nextY < mHe && nextX >= 0 && nextX < mWi) {
            System.out.println("Player move to [" + (nextX+1) + ":" + (nextY+1) + "]  success");
            return true;
        } else {
            posPlx = currentX;
            posPly = currentY;
            System.out.println("Invalid move. Please try again");
            return false;
        }
    }

    public static void nextMove(int currentY, int currentX, int nextY, int nextX) {
        if (cremap[nextX][nextY] > 0) {
            System.out.println("Next step");
        }
        cremap[currentY][currentX] = step;
        cremap[posPly][posPlx] = playerV;
    }

    public static int randomRange(int min, int max) {
        Random random = new Random();
        int diff = max - min;
        int value = random.nextInt(diff+1);
        return min + value;
   }
}
