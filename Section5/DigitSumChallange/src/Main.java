public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits 125 = " + sumDigits(125));
        System.out.println("The sum of the digits -125 = " + sumDigits(-125));
        System.out.println("The sum of the digits 4 = " + sumDigits(4));
        System.out.println("The sum of the digits 32123 = " + sumDigits(32123));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if(number < 10) {
            return -1;
        }
        // 125 / 10 = 12 // 12 * 10 = 120 // 125 - 120 = 5
        while(number > 0) {
            // Extract the least significant digit
            int digit = number % 10;
//            System.out.println("Digit: " + digit);
            // Increment sum with least significant digit
            sum += digit;
//            System.out.println("Sum: " + sum);
            // Drop least significant digit from number
            number /= 10;
//            System.out.println("Number: " + number);
        }
        return sum;
    }
}
