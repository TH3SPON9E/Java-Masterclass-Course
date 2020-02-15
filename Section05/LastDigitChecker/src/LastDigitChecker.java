public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71)); // True
        System.out.println(hasSameLastDigit(23, 32, 42)); // True
        System.out.println(hasSameLastDigit(41, 42, 43)); // False
        System.out.println(hasSameLastDigit(9, 99, 999)); // False 9 < 10
        System.out.println(hasSameLastDigit(10, 10, 1001)); // False 1001 > 1000

        System.out.println(isValid(10)); // True
        System.out.println(isValid(468)); // True
        System.out.println(isValid(1051)); // False
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if((x < 10 || y < 10 || z < 10) || (x > 1000 || y > 1000 || z > 1000)) {
            return false;
        }
        int lastDigitX = x % 10;
        int lastDigitY = y % 10;
        int lastDigitZ = z % 10;

        return ((lastDigitX == lastDigitY || lastDigitX == lastDigitZ || lastDigitY == lastDigitZ));
    }

    public static boolean isValid(int x) {
        return (x >= 10 && x <= 1000);
    }
}
