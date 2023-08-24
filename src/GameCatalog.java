import java.util.ArrayList;
import java.util.HashMap;

public class GameCatalog {

    HashMap <Game, Integer> gameDictionary;

    public GameCatalog() {
        this.gameDictionary = new HashMap<Game, Integer>();
    }

    public static void addGame(ArrayList<Game> gamesArrayList, String gameName, String genre, int dateOfPublishing) {
        Game game = new Game (gameName, genre, dateOfPublishing);
        gamesArrayList.add(game);
    }

    public static void getAvailableGames() {

    }

    public void addGame(String gameName, int quantity) {

    }

    public static ArrayList<Game> getAvailableGames(ArrayList<Game> gamesArrayList){
        ArrayList<Game> availableGames = new ArrayList<>();

        for (Game availableGame : gamesArrayList) {
            if (availableGame.getQuantity() > 0) {
                availableGames.add(availableGame);
            }
        }
        return availableGames;
    }

    public static HashMap<> reduceTheAmountOfGames() {

    }

    // нужен метод, который будет уменьшать кол-во игр;


    public HashMap<Game, Integer> getGameDictionary() {
        return gameDictionary;
    }
}






/*
 public static Game findGameByName(ArrayList<Game> gamesArrayList, String gameName) {

        for (Game game : gamesArrayList) {
            if (game.getGameName().equals(gameName)) {
                return game;
            }
        }
        return null;
    }
 */