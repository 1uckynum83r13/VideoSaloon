import java.util.ArrayList;
import java.util.Objects;

public class Printer {
    public static void printAvailableGames(ArrayList<GameCatalog> allGames) {

        for (GameCatalog gameGenres : allGames) {
            System.out.println("---");
            System.out.println(gameGenres.getName());

            for (Game game : gameGenres.getGameDictionary().keySet()) {
                System.out.println("Название игры: " + game.getGameName());
                System.out.println("Жанр: " + game.getGenre());
                System.out.println("Год публикации: " + game.getDateOfPublishing());
            }
        }
    }
}
