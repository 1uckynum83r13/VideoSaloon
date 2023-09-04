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

        GameCatalog shooterGames = new GameCatalog("shooterGames");
        shooterGames.gameDictionary.put(new Game("STALKER - Чистое Небо", "Шутер от 1-го лица", 2008), 5);
        shooterGames.gameDictionary.put(new Game("STALKER - Тень Чернобыля", "Шутер от 1-го лица", 2007), 5);
        shooterGames.gameDictionary.put(new Game("Counter - Strike 1.6", "Шутер от 1-го лица", 2003), 5);
        shooterGames.gameDictionary.put(new Game("Counter - Strike Source", "Шутер от 1-го лица", 2004), 5);
        shooterGames.gameDictionary.put(new Game("Battlefield 2", "Шутер от 1-го лица", 2005), 5);
        shooterGames.gameDictionary.put(new Game("Vietcong", "Шутер от 1-го лица", 2003), 5);

        GameCatalog racingGames = new GameCatalog("racingGames");
        racingGames.gameDictionary.put(new Game("Need For Speed 5: Porsche Unleashed", "Аркадные гонки", 2000), 5);
        racingGames.gameDictionary.put(new Game("Need For Speed Underground 1", "Аркадные гонки", 2003), 5);
        racingGames.gameDictionary.put(new Game("Need For Speed Underground 2", "Аркадные гонки", 2004), 5);
        racingGames.gameDictionary.put(new Game("Need For Speed: Most Wanted", "Аркадные гонки", 2005), 5);
        racingGames.gameDictionary.put(new Game("Need For Speed: Carbon", "Аркадные гонки", 2006), 5);
        racingGames.gameDictionary.put(new Game("Race Driver: GRID", "Гоночная игра", 2008), 5);


        GameCatalog strategyGames = new GameCatalog("strategyGames");
        strategyGames.gameDictionary.put(new Game("Civilization V", "Пошаговая стратегия", 2010), 5);
        strategyGames.gameDictionary.put(new Game("Civilization VI", "Пошаговая стратегия", 2016), 5);
        strategyGames.gameDictionary.put(new Game("Age Of Empires III", "Стратегия в реальном времени", 2005), 5);

        ArrayList<GameCatalog> allGames = new ArrayList<>();
        allGames.add(shooterGames);
        allGames.add(racingGames);
        allGames.add(strategyGames);

        //ArrayList<Record> records = new ArrayList<>();

        //Manager manager = new Manager("Вася");

        //manager.makeRecord(records, shooterGames.findGameByName("Vietcong"), personsArrayList.get(0), shooterGames);
        //manager.makeRecord(records, racingGames.findGameByName("Need For Speed Underground 2"), personsArrayList.get(1), racingGames);
        //manager.makeRecord(records, strategyGames.findGameByName("Civilization V"), personsArrayList.get(2), strategyGames);

        Printer.printAvailableGames(allGames);
    }
}