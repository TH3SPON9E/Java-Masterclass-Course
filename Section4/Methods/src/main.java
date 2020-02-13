public class main {
    public static void main(String args[]) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int position;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        position = calculateHighScorePosition(1500);
        displayHighScorePosition("Mathew", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Mark", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Luke", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("John", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Noah", position);
        position = calculateHighScorePosition(500);
        displayHighScorePosition("Moses", position);
        position = calculateHighScorePosition(100);
        displayHighScorePosition("Abraham", position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScorePosition(int score) {
        /*if(score >= 1000) {
            return 1;
        }
        else if(score >= 500) {
            return 2;
        }
        else if(score >= 100) {
            return 3;
        }
        return 4;*/

        // Alternative way of writing this code by assigning a variable
        // and returning one return statement
        int position = 4; // Assuming position four will be returned
        if(score >= 1000) {
            position = 1;
        }
        else if(score >= 500) {
            position = 2;
        }
        else if(score >= 100) {
            position = 3;
        }
        return position;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }
}