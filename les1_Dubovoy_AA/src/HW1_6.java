public class HW1_6 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords () {
        String ThreeWords = "Orange\n" + "Banana\n" + "Apple"; //HW1.2
        System.out.println(ThreeWords); //HW1.2
    }

    public static void checkSumSign() {
        int a = 7, b = -7, c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else if (value <= 100) {
            System.out.println("Желтый");
        }

    }

    public static void compareNumbers() {
        int a = 10;
        int b = a^-5;
        if (a >= b) {
            System.out.println("a >= b");
        }else  {
            System.out.println("a < b");
        }
    }
}

