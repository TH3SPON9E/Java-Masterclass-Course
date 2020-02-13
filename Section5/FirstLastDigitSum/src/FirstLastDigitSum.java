public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = number % 10;

        while(number > 0) {
            if(number < 10) {
                firstDigit = number;
                break;
            }
            firstDigit = number /= 10;
        }
        return firstDigit + lastDigit;
    }
}
