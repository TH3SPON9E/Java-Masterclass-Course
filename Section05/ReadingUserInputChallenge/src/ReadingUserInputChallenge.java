import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while(counter < 10) {
            System.out.println("Enter number #" + (counter + 1) +":");
            boolean isAnInt = sc.hasNextInt();
            if(isAnInt) {
                int number = sc.nextInt();
                counter++;
                sum += number;
            }
            else {
                System.out.println("Invalid Number");
            }
            sc.nextLine(); // Handle end of line enter key
        }
        System.out.println("Sum of all numbers = " + sum);

        sc.close();
    }
}
