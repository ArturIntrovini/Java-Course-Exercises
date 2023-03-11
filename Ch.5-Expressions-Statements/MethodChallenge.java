public class MethodChallenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Artur", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Leonardo", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Guilherme", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Marcelo", highScorePosition);
    }
    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get into position " + playerPosition + " on the High Score list.");
        }
    public static int calculateHighScorePosition(int playerScore) {

        int position = 1;
        if (playerScore < 100){
            position = 4;
        } else if (playerScore < 500) {
            position = 3;
        } else if (playerScore < 1000) {
            position = 2;
        }
        return position;
    }
}