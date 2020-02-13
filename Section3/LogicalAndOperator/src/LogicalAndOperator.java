public class LogicalAndOperator {

	public static void main(String[] args) {
		/* 
		 * Operators 
		 * == equal to 
		 * > greater than
		 * < less than 
		 * >= greater than or equal to
		 * <= less then or equal to
		 * && logical and operator
		 * || logical or operator
		 */
		int topScore = 80;
		if(topScore < 100) {
			System.out.println("You got the high score!");
		}
		
		int secondTopScore = 60;
		if ((topScore > secondTopScore) || (topScore < 100)) {
			System.out.println("Great than second top score and less than 100");
		}
		
		if ((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("Either or both of the conditions are ture");
		}
		
		/*
		 *  Assignment operator vs equals operator
		 *  assignment (assign variable to value)
		 *  == equals to (test one variable against value/variable)
		*/
		int newValue = 50;
		if (newValue == 50) {
			System.out.println("This is true");
		}
		
		boolean isCar = false;
		/* 
		 * Using the = assignment operator assigns isCar to true
		 * The condition then becomes true and the block executes
		 * To test the variable against a value use the == equals operator
		 * 
		 * if(isCar = true) {
		 * 	System.out.println("This should not happen");
		 * }
		*/
		if(isCar == true) {
			System.out.println("This should not happen");
		}
		
		/* 
		* A better method to testing if something is true or false
		* A condition on its own is tested if it true eg. (isCar)
		* Using the not ! operator this test if is false eg. (isCar!)
		*/
		if(isCar) {
			System.out.println("This should not happen");
		}
		
		/* 
		 * Ternary Operator (three operands) is a shortcut to assigning
		 * one of two values to a variable depending on a given condition
		 * First operand is the condition that is tested on
		 * Second operand is value to sign to first condition is true
		 * Third operand is the value to sign to first condition if false
		 * 
		 * condition is variable == value
		 * ? ternary operator
		 * to the left is condition
		 * to the right is to value options
		 * to the left of : value is assigned if condition is true
		 * to the right of : value is assigned if condition is false
		 * eg. 
		 * var = 10 ? tooLow : toHigh
		 */
		isCar = true;
		boolean wasCar = isCar ? true : false;
		if(wasCar) {
			System.out.println("wasCar is true");
		}
		
		int ageOfClient = 20;
		boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
		if(isEighteenOrOver) {
			System.out.println("isEighteenOrOver is true");
		}
		/*
		 * Exercise from Video
		 * Operator Precedence is BODMAS
		 * Brackets, Order, Division, Multiplication, Addition, Subtraction
		 */
		
		double d1 = 20.00d;
		double d2 = 80.00d;
		double dTotal = (d1 + d2) * 100.00d;
		double dRemainder = dTotal % 40.00d;
		System.out.println("My total is: " + dTotal);
		boolean b1 = (dRemainder == 0) ? true : false;
		System.out.println("Boolean = " + b1);
		if(!b1) {
			System.out.println("Got some remainder");
		}
		else {
			System.out.println("Got no remainder");
		}
		
	}
}