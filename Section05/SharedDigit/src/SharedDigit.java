public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // True
        System.out.println(hasSharedDigit(9, 99)); // False < 10
        System.out.println(hasSharedDigit(15, 55)); // True
        System.out.println(hasSharedDigit(12, 100)); // False > 99
        System.out.println(hasSharedDigit(12, 34)); // False
    }

    public static boolean hasSharedDigit(int x, int y) {
        if((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }
        int firstDigitX = x / 10;
        int lastDigitX = x % 10;
        int firstDigitY = y / 10;
        int lastDigitY = y % 10;

        return (firstDigitX == firstDigitY || firstDigitX == lastDigitY)
                || (lastDigitX == firstDigitY || lastDigitX == lastDigitY);
    }
}
