public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int num = number;
        while (num != 0) {
            int digit = num % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            num = num / 10;
        }
//        System.out.println("Reverse Number = " + reverseNumber);
//        System.out.println(number);
        return number == reverseNumber;
    }
}
