// Parsing Strings to type int and double. This can also be used for types long and float.

public class ParsingValuesFromString {

    public static void main(String[] args) {
        String numbersAsString = "2018.125";
        System.out.println("numbersAsString = " + numbersAsString);

        // Integer is class and parseInt is the method to convert string to int.
//        int number = Integer.parseInt(numbersAsString);

        // Double is class and parseDouble is the method to convert string to double.
        double number = Double.parseDouble(numbersAsString);
        System.out.println("Number = " + number);

        numbersAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numbersAsString);
        System.out.println("number = " + number);
    }
}
