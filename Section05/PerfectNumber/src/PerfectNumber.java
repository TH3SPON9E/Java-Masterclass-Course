public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); // True
        System.out.println(isPerfectNumber(28)); // True
        System.out.println(isPerfectNumber(5)); // False
        System.out.println(isPerfectNumber(-1)); // False
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }
        int sum = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
                if(sum == number) {
                    return true;
                }
            }
        }
        return false;
    }
}
