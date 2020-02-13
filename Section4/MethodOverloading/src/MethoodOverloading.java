public class MethoodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Peter", 500);
        System.out.println("New score " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimetres(6, 0);
        calcFeetAndInchesToCentimetres(100);
        calcFeetAndInchesToCentimetres(157);
        calcFeetAndInchesToCentimetres(-10);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }


    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        if(feet >= 0 && (inches >= 0 && inches <= 12)) {
            double centimetres = ((feet * 12) + inches) * 2.54;
            System.out.println(feet + " feet and " + inches + " inches = " + centimetres + "cm");
            return centimetres;
        }
        else {
            System.out.println("Invalid Parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimetres(double inches) {
        if(inches >= 0) {
            double feet = (int)inches / 12;
            double remainingInches = (int)inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet with remainder " + remainingInches);
            return calcFeetAndInchesToCentimetres(feet, remainingInches);
        }
        else {
            System.out.println("Invalid Parameters");
            return -1;
        }
    }
}
