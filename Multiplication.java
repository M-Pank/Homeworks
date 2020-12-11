public class Multiplication {
    public static void main(String[] args) {
        multiplication(10);
    }

    public static void multiplication(int max) {
        for(int x = 1; x <= max; x++) {
            for(int y = 1; y <= max; y++) {
                System.out.print(String.format("%4d", x * y));
            }
            System.out.println();
        }
    }
}
