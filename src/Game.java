import java.util.ArrayList;

public class Game {
    private int gameId;
    private String gameName;
    private String genre;
    private int dateOfPublishing;

    public Game(int gameId, String gameName, String genre, int dateOfPublishing) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.genre = genre;
        this.dateOfPublishing = dateOfPublishing;

    }


    public String getGameName() {
        return gameName;
    }
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDateOfPublishing() {
        return dateOfPublishing;
    }
    public void setDateOfPublishing(int dateOfPublishing) {
        this.dateOfPublishing = dateOfPublishing;
    }

}
