import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        long average;
        int count = 0;

        while(true) {
            count++;
            boolean isInt = sc.hasNextInt();

            if(isInt) {
                int input = sc.nextInt();
                sum += input;
            }
            else {
                count--;
                break;
            }
            sc.nextLine();
        }
        average = Math.round((double)sum / (double)count);
        System.out.println("SUM = " + sum + " AVG = " + average);
        sc.close();
    }
}
