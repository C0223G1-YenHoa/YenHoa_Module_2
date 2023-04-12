package ss8_clean_code.excercise;

public class TennisGame {
    private static String score = "";

    public TennisGame() {
    }

    public static void equalPoints(int mScore1) {
        switch (mScore1) {
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

    public static void greaterThan4(int mScore1, int mScore2) {
        int minusResult = mScore1 - mScore2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
    }

    public static void remainCase(int mScore1, int mScore2) {
        switch (mScore1) {
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
        switch (mScore2) {
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

    public static String getScore(int mScore1, int mScore2) {
        if (mScore1 == mScore2) {
            TennisGame.equalPoints(mScore1);
        } else if (mScore1 >= 4 || mScore2 >= 4) {
            TennisGame.greaterThan4(mScore1, mScore2);
        } else {
            TennisGame.remainCase(mScore1, mScore2);
        }
        return score;
    }
}
