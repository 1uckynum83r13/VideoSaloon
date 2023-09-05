import java.util.ArrayList;
import java.util.HashMap;

public class GameCatalog {

    HashMap <Game, Integer> gameDictionary;
    private String name;

    public GameCatalog(String name) {
        this.gameDictionary = new HashMap<Game, Integer>();
        this.name = name;
    }

//    public static void addGame(ArrayList<Game> gamesArrayList, String gameName, String genre, int dateOfPublishing) {
//        Game game = new Game (gameName, genre, dateOfPublishing);
//        gamesArrayList.add(game);
//    }

    public void addGame(String gameName, int quantity) {

    }

    public boolean checkGameAvailability(String gameName) {
        Game searchedGame = null;
        for (Game game : this.gameDictionary.keySet()) {
            if (game.getGameName().equals(gameName)) {
                searchedGame = game;
            }
        }
            if (searchedGame == null) {
                return false;
            }

            if (gameDictionary.get(searchedGame) == 0) {
                return false;
            }
        return true;
    }

    public void reduceGameQuantity(String gameName) {
        for (Game game : this.gameDictionary.keySet()) {
            if(game.getGameName().equals(gameName)) {
                Integer amount = gameDictionary.get(game);

                amount --;
                this.gameDictionary.put(game, amount);
            }
        }
    }

    public Game findGameByName(String gameName) {
        for (Game game : this.gameDictionary.keySet()) {
            if (game.getGameName().equals(gameName)) {
                return game;
            }
        }
        return null;
    }

    public HashMap<Game, Integer> getGameDictionary() {
        return gameDictionary;
    }

    public String getName() {
        return name;
    }
}
