import java.util.ArrayList;

public class Interface {
    public static void showAvailableGames(ArrayList<Game> gamesWithNonZeroQuantity) {
        GameCatalog.getAvailableGames(gamesWithNonZeroQuantity);
        Printer.printAvailableGames(gamesWithNonZeroQuantity);
    }
}
