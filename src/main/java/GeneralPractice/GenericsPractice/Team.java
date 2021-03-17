package GeneralPractice.GenericsPractice;

public class Team {

    private int matchesPlayed = 0;
    private int matchesWon = 0;
    private int matchesDrawn = 0;
    private int matchesLost = 0;

    public Team() {
    }

    public Team(int matchesPlayed, int matchesWon, int matchesDrawn, int matchesLost) {
        this.matchesPlayed = matchesPlayed;
        this.matchesWon = matchesWon;
        this.matchesDrawn = matchesDrawn;
        this.matchesLost = matchesLost;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public int getMatchesDrawn() {
        return matchesDrawn;
    }

    public void setMatchesDrawn(int matchesDrawn) {
        this.matchesDrawn = matchesDrawn;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

    public void setMatchesLost(int matchesLost) {
        this.matchesLost = matchesLost;
    }
}
