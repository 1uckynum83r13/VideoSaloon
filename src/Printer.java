import java.util.ArrayList;

public class Printer {
    public static void printAvailableGames(ArrayList<Game> availableGames) {
        for (Game games : availableGames) {
            System.out.println("Название игры - " + games.getGameName());
            System.out.println("Жанр - " + games.getGenre());
            System.out.println("Год выпуска - " + games.getDateOfPublishing());
            System.out.println("Остаток копий для аренды - ");
        }
    }
}
