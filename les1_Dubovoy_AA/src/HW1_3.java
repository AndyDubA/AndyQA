public class HW1_3 {

    public static void main(String[] args) {
        checkSumSign();
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

}
