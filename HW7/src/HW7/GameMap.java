package HW7;

import HW7.mod.Enemy;
import HW7.mod.Player;
import HW7.mod.Tools;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {

    public Window window;

    private int LABEL_PLAYER = 1;
    private int LABEL_ENEMY = 2;
    private int LABEL_READY_CELL = 99;
    private int LABEL_EMPTY_CELL = 0;


    private int[][] map;
    private int[][] invisibleMap;
    private int mapWidth;
    private int mapHeight;
    private int mapSizeMin = 3;
    private int mapSizeMax = 5;

    private int currentLevel = 0;
    private int countEnemies;

    public static final int DIR_Up = 8;
    public static final int DIR_Down = 2;
    public static final int DIR_Left = 4;
    public static final int DIR_Right = 6;
    public static final int DIR_Left_Up = 7;
    public static final int DIR_Right_Down = 3;
    public static final int DIR_Left_Down = 1;
    public static final int DIR_Right_Up = 9;

    private int cellWidth;
    private int cellHeight;

    private Player player;
    private Enemy enemy;

    private boolean isMapExsist;
    private boolean isGameStart;

    public static boolean setRandomStartPosition = true;

    GameMap(Window window) {
        this.window = window;
        setBackground( new Color(22, 144, 208));
        isMapExsist = false;
        isGameStart = false;
    }

    void  initGame() {
        player = new Player();
        currentLevel = 0;
        startNewRaund();
        isMapExsist = true;
        isGameStart = true;
    }

    private void startNewRaund() {
        createGameWorld();
        initPlayer();
        createEnemy();
        ++currentLevel;
        window.refreshGameInfo();
        window.recordLog("Welcom to level" + currentLevel);
    }

    private void createGameWorld() {
        mapHeight = Tools.randomRange(mapSizeMin, mapSizeMax);
        mapWidth = Tools.randomRange(mapSizeMin, mapSizeMax);
        map = new int[mapHeight][mapWidth];
        invisibleMap = new int[mapHeight][mapWidth];
        repaint();
    }

    private void initPlayer() {
        if (setRandomStartPosition) {
            player.setPosition(Tools.randomRange(0, mapWidth - 1), Tools.randomRange(0, mapHeight - 1));
        } else {
            player.setPosition(mapWidth / 2, mapHeight / 2);
        }
        map[player.getY()][player.getX()] = LABEL_PLAYER;

    }

    private void createEnemy() {
        int posX;
        int posY;

        countEnemies = (mapWidth + mapHeight) / 4;

        for (int i = 0; i < countEnemies; i++) {

            do {
                posX = Tools.random.nextInt(mapWidth);
                posY = Tools.random.nextInt(mapHeight);
            } while (posX == player.getX() && posY == player.getY());

            invisibleMap[posY][posX] = LABEL_ENEMY;
        }
        enemy = new Enemy();

    }

    private void render(Graphics g) {
        drawMap(g);

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {

                if (map[y][x] == LABEL_EMPTY_CELL) {
                    continue;
                }

                if (map[y][x] == LABEL_PLAYER) {
                    g.setColor(Color.RED);
                    g.fillOval(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
                }

                if (map[y][x] == LABEL_READY_CELL) {
                    g.setColor(new Color(85, 163, 59));
                    g.fillRect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
                }
            }
        }
    }

    void update(int direction) {
        if (!isGameStart){
            return;
        }

        int currentX = player.getX();
        int currentY = player.getY();

        switch (direction) {
            case DIR_Up:
                player.moveUp();
                break;
            case DIR_Down:
                player.moveDown();
                break;
            case DIR_Left:
                player.moveLeft();
                break;
            case DIR_Right:
                player.moveRight();
                break;
            case DIR_Left_Up:
                player.moveLeftUp();
                break;
            case DIR_Left_Down:
                player.moveLeftDown();
                break;
            case DIR_Right_Up:
                player.moveRightUp();
                break;
            case DIR_Right_Down:
                player.moveRightDown();
                break;
        }

        if (!isValidNextMove(currentY, currentX, player.getY(), player.getX())) {
            return;
        }

        playerNextMoveAction(currentY, currentX, player.getY(), player.getX());
        window.refreshGameInfo();
        repaint();

        if (isFullMap()){
            startNewRaund();
        }

        if (!player.isPlayerAlive()) {
            isGameStart = false;
            JOptionPane.showMessageDialog(this, "PLAYER DIED" + player.getStep());
        }

    }

    private void drawMap(Graphics g) {

        if (!isMapExsist) {
            return;
        }

        int width = getWidth();
        int height = getHeight();

        cellWidth = width / mapWidth;
        cellHeight = height / mapHeight;

        g.setColor(Color.WHITE);

        for (int i = 0; i < mapHeight; i++) {
            int y = i * cellHeight ;
            g.drawLine(0, y, width, y);
        }

        for (int i = 0; i < mapWidth; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, height);
        }
    }


    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getCountEnemies() {
        return countEnemies;
    }

    public boolean isValidNextMove(int currentY, int currentX, int nextY, int nextX) {
        if (nextY >= 0 && nextY < mapHeight && nextX >= 0 && nextX < mapWidth) {
            window.recordLog("Player move to [" + (nextX + 1) + ":" + (nextY + 1) + "]  success");
            return true;
        } else {
            player.setPosition(currentX, currentY);
            window.recordLog("Invalid move. Please try again");
            return false;
        }
    }

    public void playerNextMoveAction(int currentY, int currentX, int nextY, int nextX) {
        if (invisibleMap[nextY][nextX] == LABEL_ENEMY) {
            player.decreaceHealth(enemy.getPowerPoint());
            countEnemies--;
            window.recordLog("Alert! Enemy give damage " + enemy.getPowerPoint());
        }


        invisibleMap[currentY][currentX] = LABEL_READY_CELL;
        map[currentY][currentX] = LABEL_READY_CELL;
        map[player.getY()][player.getX()] = LABEL_PLAYER;
    }

    public boolean isFullMap() {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                if (map[y][x] == LABEL_EMPTY_CELL) return false;
            }
        }
        return true;
    }

    public String getMapSizeInfo() {
        return mapWidth + "x" + mapHeight;
    }

    public int getPlayerHPInfo() {
        return player.getHealth();
    }

    public int getPlayerStepsInfo() {
        return player.getStep();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }
}
