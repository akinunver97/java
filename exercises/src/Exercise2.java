public class Exercise2 {


    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ahmet", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Mehmet", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Efe", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Akin", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        int x = 4;
        if (playerScore >= 1000){
            x = 1;
        }else if (playerScore >= 500){
            x = 2;
        }else if (playerScore >= 100){
            x = 3;
        }
        return x;
    }
}
