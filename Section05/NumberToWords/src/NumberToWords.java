public class NumberToWords {

    public static void main(String[] args) {
//        System.out.println("Get Digit Count");
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//
//        System.out.println("\n Reverse");
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));

        System.out.println("\n Numbers To Words");
        numberToWords(0);
//        numberToWords(123);
//        System.out.println();
//        numberToWords(1010);
//        System.out.println();
//        numberToWords(1000);
//        System.out.println();
//        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        String output = "";
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        if(number == 0) {
            output += "Zero";
        }
        int reverseNumber = reverse(number);
        int reverseNumberCount = getDigitCount(reverseNumber);
        while(reverseNumber > 0) {
            int lastDigit = reverseNumber % 10;
            switch(lastDigit) {
                case 0:
                    output += "Zero ";
                    break;
                case 1:
                    output += "One ";
                    break;
                case 2:
                    output += "Two ";
                    break;
                case 3:
                    output += "Three ";
                    break;
                case 4:
                    output += "Four ";
                    break;
                case 5:
                    output += "Five ";
                    break;
                case 6:
                    output += "Six ";
                    break;
                case 7:
                    output += "Seven ";
                    break;
                case 8:
                    output += "Eight ";
                    break;
                case 9:
                    output += "Nine ";
                    break;
                default:
                    System.out.println("No value found");
                    break;
            }
            reverseNumber /= 10;
        }
        if(getDigitCount(number) != getDigitCount(reverseNumber)) {
            for(int i = reverseNumberCount; i < getDigitCount(number); i++){
                output += "Zero ";
            }
        }
        System.out.println(output);
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while(number != 0) {
            int lastDigit = number % 10;
            reverseNumber += lastDigit;
            number /= 10;
            if(number != 0) {
                reverseNumber *= 10;
            }
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if(number < 0) {
            return -1;
        }
        else if(number == 0) {
            return 1;
        }
        else {
            while(number > 0) {
                count++;
                number /= 10;
            }
        }
        return count;
    }
}
