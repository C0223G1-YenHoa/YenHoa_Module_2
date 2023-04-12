package ss8_clean_code.excercise;

public class TennisGame {
    private static String score = "";

    public TennisGame() {
    }

    public static void equalPoints(int player1Score) {
        switch (player1Score) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
    }

    public static void greaterThan4(int playerScore1, int playerScore2) {
        int minusResult = playerScore1 - playerScore2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
    }

    public static void remainCase(int player1Score, int player2Score) {
        switch (player1Score) {
            case 0:
                score += "Love -";
                break;
            case 1:
                score += "Fifteen - ";
                break;
            case 2:
                score += "Thirty - ";
                break;
            case 3:
                score += "Forty - ";
                break;
        }
        switch (player2Score) {
            case 0:
                score += "Love ";
                break;
            case 1:
                score += "Fifteen ";
                break;
            case 2:
                score += "Thirty ";
                break;
            case 3:
                score += "Forty ";
                break;
        }
    }

    public static String getScore(int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            TennisGame.equalPoints(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            TennisGame.greaterThan4(player1Score, player2Score);
        } else {
            TennisGame.remainCase(player1Score, player2Score);
        }
        return score;
    }
}
