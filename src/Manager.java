import java.util.ArrayList;

public class Manager {
    private String managerName;
    public Manager (String managerName) {
        this.managerName = managerName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public static void addPerson(ArrayList<Person> personsArrayList, String personName, String telNumber, String email) {
        Person person = new Person (personName, telNumber, email);
        personsArrayList.add(person);
    }

    public static ArrayList<Game> addedGamesForPerson(Person person, ArrayList<Game> addedGamesArrayList, String gameName, String genre, int dateOfPublishing, int quantity) {
        Game game = new Game(gameName, genre, dateOfPublishing);
        if (quantity > 0) {
            addedGamesArrayList.add(game);
        }
        return addedGamesArrayList;
    }

    public static void makeAdoptRecord(Person person, Game game){
        System.out.println("Клиент - " + person.getPersonName());
        System.out.println("Арендовал игру - " + game.getGameName());
        // этот метод должен выдать инфу о том, кто что заказал
    }

    // в мейне будет листофрекордс с записями о клиентах;
}
