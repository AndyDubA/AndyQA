public class HW1_5 {

    public static void main(String[] args) {
        compareNumbers();
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