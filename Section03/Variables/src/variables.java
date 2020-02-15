public class variables {
    public static void main(String[] args) {
        // Integer Variables (32 bits)
        int myIntMin = Integer.MIN_VALUE;
        int myIntMax = Integer.MAX_VALUE;
        int myInt = (10 + 5) + (2 * 10);
        int myInt1 = 12;
        int myInt2 = myInt * 2;
        int myIntTotal = myInt + myInt1 + myInt2;
        int varFinal = 1000 - myIntTotal;
        // System.out.println(varFinal);
        // System.out.println("Integer Minimum Value: " + myIntMin);
        // System.out.println("Integer Maximum Value: " + myIntMax);

        // Byte Variables (8 bits)
        byte myByteMin = Byte.MIN_VALUE;
        byte myByteMax = Byte.MAX_VALUE;
        // System.out.println("Byte Minimum Value: " + myByteMin);
        // System.out.println("Byte Maximum Value: " + myByteMax);

        // Short Variable (16 bits)
        short myShortMin = Short.MIN_VALUE;
        short myShortMax = Short.MAX_VALUE;
        // System.out.println("Short Minimum Value: " + myShortMin);
        // System.out.println("Short Maximum Value: " + myShortMax);


        // Long Variables (64 bits)
        long myLong = 100L;
        long myLongMin = Long.MIN_VALUE;
        long myLongMax = Long.MAX_VALUE;
        // System.out.println("MyLong Value: " + myLong);
        // System.out.println("Long Minimum Value: " + myLongMin);
        // System.out.println("Long Maximum Value: " + myLongMax);

        // Casting (Convert one type to another)
        // Shows error as Java wants to use integer, to overcome
        // this use casting with variable type and equation in parenthesis
        // byte myByteValue = myByteMin / 2;
        // Using Casting
        byte myByteValue = (byte)(myByteMin / 2);

        // short myShortValue = myShortMin / 2;
        short myShortValue = (short)(myShortMin / 2);
    }
}
