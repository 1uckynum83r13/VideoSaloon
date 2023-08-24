import java.util.ArrayList;

public class Main {
// Программа для проката видеоигр на дисках;

// 1) Данные о играх: название, жанр, год выпуска, и так же количество копий на складе; v

// 2) Данные о пользователях, арендовавших игру: имя, телефон, почта; v

// 3) Возможности программы: вывести все игры в каталоге, доступные для аренды; v

// 4) Вывести все игры, которые у кого-то на руках;

// 5) Оповестить пользователя по почте о том, что он держит игру на руках больше недели;

// 6) Метод: валидировать игру на наличие;

// 7) Записать игру за персоной;

// 8) Добавить персону в список клиентов; v

// 9) Отнять один из количества игр;

    public static void main(String[] args) {

        ArrayList<Person> personsArrayList = new ArrayList();
        Manager.addPerson(personsArrayList, "Стас", "+7(999)999-99-99", "s@mail.ru");
        Manager.addPerson(personsArrayList, "Андрей", "+7(888)888-88-88", "a@mail.ru");
        Manager.addPerson(personsArrayList, "Ваня", "+7(777)777-77-77", "v@mail.ru");

        GameCatalog gameCatalog = new GameCatalog();
        gameCatalog.gameDictionary.put(new Game("STALKER - Чистое Небо", "Шутер от 1-го лица", 2008), 5);
        gameCatalog.gameDictionary.put(new Game("STALKER - Тень Чернобыля", "Шутер от 1-го лица", 2007), 5);
        gameCatalog.gameDictionary.put(new Game("Counter - Strike 1.6", "Шутер от 1-го лица", 2003), 5);
        gameCatalog.gameDictionary.put(new Game("Counter - Strike Source", "Шутер от 1-го лица", 2004), 5);
        gameCatalog.gameDictionary.put(new Game("Battlefield 2", "Шутер от 1-го лица", 2005), 5);
        gameCatalog.gameDictionary.put(new Game("Vietcong", "Шутер от 1-го лица", 2003), 5);

        //ArrayList<Game> availableGames = GameCatalog.getAvailableGames(gamesArrayList);
        //Printer.printAvailableGames(availableGames);

        ArrayList<Record> listOfRecords = new ArrayList<>();

        // сделать три записи (рекордов) для трёх клиентов. человек может взять одну игру
    }
}