import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minNumber = 0;
        int maxNumber = 0;
        boolean firstInput = true;

        while(true) {
            System.out.println("Enter Number");
            boolean isInt = sc.hasNextInt();
            if(isInt) {
                int input = sc.nextInt();
                if(firstInput) {
                    minNumber = input;
                    maxNumber = input;
                    firstInput = false;
                }
                if(input < minNumber) {
                    minNumber = input;
                }
                else if(input > maxNumber) {
                    maxNumber = input;
                }
            }
            else {
                break;
            }
            sc.nextLine(); // Handle input
        }
        System.out.println("Minimum #: " + minNumber);
        System.out.println("Maximum #: " + maxNumber);
        sc.close();
    }
}
