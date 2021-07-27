import java.util.Random;
import java.util.Scanner;

public class HW3_1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        hw3_1();
        hw3_2();
        hw3_3();
        hw3_4();
        hw3_5();
    }

    public static void hw3_1() {
        int[] zo = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < zo.length; i++) {
            if (zo[i] == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        System.out.println();
    }


    public static void hw3_2() {
        int[] sto = new int[101];
        for (int i = 1; i < 101; i++) {
            System.out.println("sto " + i);
        }
        System.out.println();
    }


    public static void hw3_3() {
        int[] massiv = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 6) {
                System.out.print(massiv[i] * 2 + " ");
            } else {
                System.out.print(massiv[i] + " ");
            }
        }
        System.out.println();
    }


    public static void hw3_4() {
        int gover = 7;
        int[][] sevXsev = new int[gover][gover];
        for (int i = 0; i < sevXsev.length; i++) {
            for (int j = 0; j < sevXsev[i].length; j++) {
                if (i == j) sevXsev[i][j] = 1;
                System.out.print(sevXsev[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void hw3_5() {

        System.out.print("Введите число = ");
        int len = scanner.nextInt();

        System.out.print("Введите число = ");
        int initialValue = scanner.nextInt();

        int[][] ror = new int[len][initialValue];

        for (int i = 0; i <ror.length; i++) {
            for (int j = 0; j <ror[i].length; j++) {
                System.out.print(ror[i][j] + " ");
        }
            System.out.println();
        }
    }
}