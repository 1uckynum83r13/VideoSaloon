import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Manager {
    private int managerId;
    private String managerName;

    public Manager(int managerId, String managerName) {
        this.managerId = managerId;
        this.managerName = managerName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

//    public static void addPerson(ArrayList<Person> personsArrayList, String personName, String telNumber, String email) {
//        Person person = new Person(personName, telNumber, email);
//        personsArrayList.add(person);
//    }

//    public static ArrayList<Game> addedGamesForPerson(Person person, ArrayList<Game> addedGamesArrayList, String gameName, String genre, int dateOfPublishing, int quantity) {
//        Game game = new Game(gameName, genre, dateOfPublishing);
//        if (quantity > 0) {
//            addedGamesArrayList.add(game);
//        }
//        return addedGamesArrayList;
//    }
//
//    public void makeRecord(ArrayList<Record> records, Game game, Person person, GameCatalog gameCatalog) {
//        if (gameCatalog.checkGameAvailability(game.getGameName())) {
//            gameCatalog.reduceGameQuantity(game.getGameName());
//            Record record = new Record(person, game);
//            records.add(record);
//            System.out.println("Запись создана: " + record);
//        }
//    }

}
