public class IntEqualityPrinter {
    private static final String INVALID_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        printEqual(1, 1, 1); // All numbers are equal
        printEqual(1, 1, 2); // Neither all are equal or different
        printEqual(1, 2, 1); // Neither all are equal or different
        printEqual(2, 1, 1); // Neither all are equal or different
        printEqual(1, 2, 3); // All numbers are different
        printEqual(-1, 1, 1); // Invalid Value
    }

    public static void printEqual(int x, int y, int z) {
        if(x >= 0 && y >= 0 && z >= 0) {
            if(x == y && y == z) {
                System.out.println("All numbers are equal");
            }
            else if(x != y && x != z && y != z) {
                System.out.println("All numbers are different");
            }
            else {
                System.out.println("Neither all are equal or different");
            }
        }
        else {
            System.out.println(INVALID_MESSAGE);
        }
    }
}
