public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // False, big bag is higher than goal
        System.out.println(canPack(1, 0, 5)); // True, big bag is equal goal
        System.out.println(canPack(0, 5, 4)); // True, small bags can be discarded
        System.out.println(canPack(2, 2, 11)); // True, big bag is worth 10, single bag can be used
        System.out.println(canPack(3, 2, 11)); // True, big bag is higher but one can be discarded,
                                                // then use one small bag
        System.out.println(canPack(-3, 2, 12)); // False, negative parameter

    }

    // bigCount = big bag of flour 5kg cannot be separated to single bags
    // smallCount = small bag of flour 1kg
    // Goal amount of flour needed to assemble a package
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // Test if any parameter is negative and return false
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        // Initialise kiloCount to 0
        int kiloCount = 0;
        // Initialise loop to loop through amount of big bags
        for(int i = 0; i < bigCount; i++) {
            // Test if kiloCount value plus another big bag is less than goal
            if(kiloCount + 5 <= goal) {
                // Increment kiloCount by big bag
                kiloCount += 5;
            }
        }
        // Initialise loop starting with the amount of kilos from big bag
        // Increment kiloCount until reach goal
        for(int i = kiloCount; i < goal; i++) {
            // Test if the smallCount has any value
            if(smallCount > 0) {
                // If so, increment kilo by one and decrement smallCount by one
                kiloCount += 1;
                smallCount -= 1;
            }
        }
        // Return true or false if the amount of kilos is equal to the goal.
        return kiloCount == goal;
    }
}
