public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        if((int)(d1 * 1000) == (int)(d2 * 1000)) {
            return true;
        }
        else {
            return false;
        }
    }
}
