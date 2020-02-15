public class Main {

    public static void main(String[] args) {

        int count = 1;
//        while(count != 6) {
//            System.out.println("Count value is: " + count);
//            count++;
//        }

//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is: " + count);
//            count++;
//        }

//        count = 5;
//        do {
//            System.out.println("Count value is: " + count);
//            count++;
//        } while(count <=  5);
        int evenNumberFound = 0;
        int number = 4;
        int finishNumber = 20;
        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                // Continue interupts the code and restarts the loop
                // No other code will execute.
                continue;
            }
            evenNumberFound++;
            System.out.println("Even number " + number);
            if(evenNumberFound == 5) {
                break;
            }
        }
        System.out.println("Even numbers found: " + evenNumberFound);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
