package HW7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {


    private int winWidth = 800;
    private int winHeight = 600;
    private int winPosX =  450;
    private int winPosY = 200;

    private GameMap map;
    private JPanel gui;

    private JPanel gameControls;
    private JButton btnStart;
    private JButton btnExit;

    private JPanel gameInfo;
    private JLabel mapSizeInfo;
    private JLabel countEnemyInfo;
    private JLabel mapRoundInfo;

    private JPanel playerInfo;
    private JLabel playerHealthInfo;
    private JLabel playerStepsInfo;

    private JPanel playerActions;
    private JButton moveUp;
    private JButton moveDown;
    private JButton moveLeft;
    private JButton moveRight;
    private JButton moveO;
    private JButton moveLeftUp;
    private JButton moveRightUp;
    private JButton moveLeftDown;
    private JButton moveRightDown;

    private JScrollPane conteinerForGameLog;
    private JTextArea gameLog;


    Window() {
        prepareWind();

        map = new GameMap(this);

        prepareGid();

        add(gui, BorderLayout.WEST);
        add(map);

        setVisible(true);
    }

    private void prepareGid(){
        gui = new JPanel();
        gui.setLayout(new GridLayout(5,1));

        prepareGameControls();
        prepareGameInfo();
        preparePlayerInfo();
        preparePlayerActions();
        prepareGameActions();

        gui.add(gameControls);
        gui.add(gameInfo);
        gui.add(playerInfo);
        gui.add(playerActions);
        gui.add(conteinerForGameLog, BorderLayout.SOUTH);

    }

    private void prepareGameControls() {

        gameControls = new JPanel();
        gameControls.setLayout(new GridLayout(2,1));

        btnStart = new JButton("Start Game!");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.initGame();
                recordLog("Start Game!");
            }
        });

        btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        gameControls.add(btnStart);
        gameControls.add(btnExit);

    }

    private void prepareGameInfo(){
        gameInfo = new JPanel();
        gameInfo.setLayout(new GridLayout(4, 1));
        gameInfo.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        mapRoundInfo = new JLabel("Current Round:");
        mapSizeInfo = new JLabel("Current map size: ");
        countEnemyInfo = new JLabel("Current enemy count: ");

        gameInfo.add(new JLabel("Game Info"));
        gameInfo.add(mapRoundInfo);
        gameInfo.add(mapSizeInfo);
        gameInfo.add(countEnemyInfo);

    }

    private void preparePlayerInfo(){
        playerInfo = new JPanel();
        playerInfo.setLayout(new GridLayout(3, 1));
        playerInfo.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        playerHealthInfo = new JLabel("Health: ");
        playerStepsInfo = new JLabel("Steps: ");

        playerInfo.add(new JLabel("Player Info"));
        playerInfo.add(playerHealthInfo);
        playerInfo.add(playerStepsInfo);

    }

    private void preparePlayerActions(){
        playerActions = new JPanel();

        playerActions.setLayout(new GridLayout(3,3));

        moveLeftUp = new JButton("↖");
        moveLeftUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.update(GameMap.DIR_Left_Up);
            }
        });
        moveUp = new JButton("↑");
        moveUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.update(GameMap.DIR_Up);
            }
        });

        moveRightUp = new JButton("↗");
        moveRightUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.update(GameMap.DIR_Right_Up);
            }
        });

        moveLeft = new JButton("←");
        moveLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.update(GameMap.DIR_Left);
            }
        });

        moveO = new JButton("0");
        moveRight = new JButton("→");
        moveRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.update(GameMap.DIR_Right);
            }
        });

        moveLeftDown = new JButton("↙");
        moveLeftDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.update(GameMap.DIR_Left_Down);
            }
        });

        moveDown = new JButton("↓");
        moveDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.update(GameMap.DIR_Down);
            }
        });

        moveRightDown = new JButton("↘");
        moveRightDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map.update(GameMap.DIR_Right_Down);
            }
        });


        playerActions.add(moveLeftUp);
        playerActions.add(moveUp);
        playerActions.add(moveRightUp);
        playerActions.add(moveLeft);
        playerActions.add(moveO);
        playerActions.add(moveRight);
        playerActions.add(moveLeftDown);
        playerActions.add(moveDown);
        playerActions.add(moveRightDown);
    }

    private void prepareGameActions(){
        gameLog = new JTextArea();
        conteinerForGameLog = new JScrollPane(gameLog);
        gameLog.setEditable(false);
        gameLog.setLineWrap(true);

        conteinerForGameLog.add(gameLog);
    }

    private void prepareWind() {
        setTitle("OKHO");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(winPosX,winPosY);
        setSize(winWidth, winHeight);
        setResizable(false);
    }

    void recordLog(String msg) {
        gameLog.append(msg + "\n");
    }

    void refreshGameInfo() {
        mapRoundInfo.setText("Current Round:" + map.getCurrentLevel());
        mapSizeInfo.setText("Current map size: " + map.getMapSizeInfo());
        countEnemyInfo.setText("Current enemy count: " + map.getCountEnemies());
        playerHealthInfo.setText("Health: " + map.getPlayerHPInfo());
        playerStepsInfo.setText("Steps: " + map.getPlayerStepsInfo());
    }
}
