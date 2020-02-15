public class TeenNumberChecker {

    public static boolean isTeen(int a) {
        return a >= 13 && a <= 19;
    }

    public static boolean hasTeen(int x, int y, int z) {
        if(isTeen(x) || isTeen(y) || isTeen(z)) {
            return true;
        }
        else {
            return false;
        }
    }
}
