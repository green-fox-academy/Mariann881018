
public abstract class TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;


    public void wonPoint(String playerName) {
        if (playerName == "player1"){
            m_score1 += 1;
        } else
            m_score2 += 1;
    }

    public String getScore() {
        return null;
    }


}
