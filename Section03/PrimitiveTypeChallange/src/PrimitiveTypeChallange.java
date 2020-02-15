public class PrimitiveTypeChallange {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L + (myByte + myShort + myInt) * 10;
        System.out.println("myLong Value: " + myLong);
    }
}
