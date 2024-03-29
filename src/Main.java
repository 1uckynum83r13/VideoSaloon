import java.awt.image.DataBufferFloat;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {

        //ArrayList<Person> personsArrayList = new ArrayList();
        //Manager.addPerson(personsArrayList, "Стас", "+7(999)999-99-99", "s@mail.ru");
//        Manager.addPerson(personsArrayList, "Андрей", "+7(888)888-88-88", "a@mail.ru");
//        Manager.addPerson(personsArrayList, "Ваня", "+7(777)777-77-77", "v@mail.ru");
//
//        GameCatalog shooterGames = new GameCatalog("shooterGames");
//        shooterGames.gameDictionary.put(new Game("STALKER - Чистое Небо", "Шутер от 1-го лица", 2008), 5);
//        shooterGames.gameDictionary.put(new Game("STALKER - Тень Чернобыля", "Шутер от 1-го лица", 2007), 5);
//        shooterGames.gameDictionary.put(new Game("Counter - Strike 1.6", "Шутер от 1-го лица", 2003), 5);
//        shooterGames.gameDictionary.put(new Game("Counter - Strike Source", "Шутер от 1-го лица", 2004), 5);
//        shooterGames.gameDictionary.put(new Game("Battlefield 2", "Шутер от 1-го лица", 2005), 5);
//        shooterGames.gameDictionary.put(new Game("Vietcong", "Шутер от 1-го лица", 2003), 5);
//
//        GameCatalog racingGames = new GameCatalog("racingGames");
//        racingGames.gameDictionary.put(new Game("Need For Speed 5: Porsche Unleashed", "Аркадные гонки", 2000), 5);
//        racingGames.gameDictionary.put(new Game("Need For Speed Underground 1", "Аркадные гонки", 2003), 5);
//        racingGames.gameDictionary.put(new Game("Need For Speed Underground 2", "Аркадные гонки", 2004), 5);
//        racingGames.gameDictionary.put(new Game("Need For Speed: Most Wanted", "Аркадные гонки", 2005), 5);
//        racingGames.gameDictionary.put(new Game("Need For Speed: Carbon", "Аркадные гонки", 2006), 5);
//        racingGames.gameDictionary.put(new Game("Race Driver: GRID", "Гоночная игра", 2008), 5);
//
//
//        GameCatalog strategyGames = new GameCatalog("strategyGames");
//        strategyGames.gameDictionary.put(new Game("Civilization V", "Пошаговая стратегия", 2010), 5);
//        strategyGames.gameDictionary.put(new Game("Civilization VI", "Пошаговая стратегия", 2016), 5);
//        strategyGames.gameDictionary.put(new Game("Age Of Empires III", "Стратегия в реальном времени", 2005), 5);
//
//        ArrayList<GameCatalog> allGames = new ArrayList<>();
//        allGames.add(shooterGames);
//        allGames.add(racingGames);
//        allGames.add(strategyGames);

        // !!!
        /*
        ArrayList<Record> records = new ArrayList<>();


        //Manager manager = new Manager("Вася");

        //manager.makeRecord(records, shooterGames.findGameByName("Vietcong"), personsArrayList.get(0), shooterGames);
        //manager.makeRecord(records, racingGames.findGameByName("Need For Speed Underground 2"), personsArrayList.get(1), racingGames);
        //manager.makeRecord(records, strategyGames.findGameByName("Civilization V"), personsArrayList.get(2), strategyGames);
        // !!!
        */

//        Printer.printAvailableGames(allGames);

        //    ТАБЛИЦА С ИГРАМИ;
        DB.openConnection();
        DB.CreateTableForCatalog();
        DB.addGame("GTA 2", "Action", 1999);
        DB.addGame("Need For Speed 5: Porsche Unleashed", "Аркадные гонки", 2000);
        DB.addGame("Need For Speed Underground 1", "Аркадные гонки", 2003);
        DB.addGame("Need For Speed Underground 2", "Аркадные гонки", 2004);
        DB.addGame("Civilization V", "Пошаговая стратегия", 2010);
        DB.addGame("Civilization VI", "Пошаговая стратегия", 2016);
        DB.addGame("Age Of Empires III", "Стратегия в реальном времени", 2005);
        DB.addGame("Battlefield 2", "Шутер от 1-го лица", 2005);
        DB.addGame("Counter - Strike 1.6", "Шутер от 1-го лица", 2003);
        DB.addGame("Vietcong", "Шутер от 1-го лица", 2003);
        DB.closeConnection();

        //    ТАБЛИЦА С ЭКЗЕМПЛЯРАМИ ИГР;
        DB.CreateGameExemplaryTable();
        DB.addGameExemplary(1);
        DB.addGameExemplary(1);
        DB.addGameExemplary(1);
        DB.addGameExemplary(2);
        DB.addGameExemplary(2);
        DB.addGameExemplary(2);
        DB.addGameExemplary(3);
        DB.addGameExemplary(3);
        DB.addGameExemplary(3);
        DB.addGameExemplary(4);
        DB.addGameExemplary(4);
        DB.addGameExemplary(4);
        DB.addGameExemplary(5);
        DB.addGameExemplary(5);
        DB.addGameExemplary(5);
        DB.addGameExemplary(6);
        DB.addGameExemplary(6);
        DB.addGameExemplary(6);
        DB.addGameExemplary(7);
        DB.addGameExemplary(7);
        DB.addGameExemplary(7);
        DB.addGameExemplary(8);
        DB.addGameExemplary(8);
        DB.addGameExemplary(8);
        DB.addGameExemplary(9);
        DB.addGameExemplary(9);
        DB.addGameExemplary(9);
        DB.addGameExemplary(10);
        DB.addGameExemplary(10);
        DB.addGameExemplary(10);
        DB.closeConnection();

        //    ТАБЛИЦА С КЛИЕНТАМИ;
        DB.CreateTableForPerson();
        DB.addPerson("Стас", "+7(999)999-99-99", "s@mail.ru");
        DB.addPerson("Андрей", "+7(888)888-88-88", "a@mail.ru");
        DB.addPerson("Ваня", "+7(777)777-77-77", "v@mail.ru");
        DB.addPerson("Миша", "+7(666)666-66-66", "m@mail.ru");
        DB.addPerson("Петя", "+7(555)555-55-55", "p@mail.ru");
        DB.addPerson("Антон", "+7(444)444-44-44", "aa@mail.ru");
        DB.addPerson("Тарас", "+7(333)333-33-33", "t@mail.ru");
        DB.addPerson("Витя", "+7(222)222-22-22", "vv@mail.ru");
        DB.addPerson("Александр", "+7(111)111-11-11", "aaa@mail.ru");
        DB.addPerson("Роман", "+7(000)000-00-00", "r@mail.ru");
        DB.closeConnection();

        //    ТАБЛИЦА И ЗАКАЗАМИ;
        DB.CreateRecordsTable();
        DB.makeRecord(1, 10);
        DB.makeRecord(2, 9);
        DB.makeRecord(3, 8);
        DB.makeRecord(4, 7);
        DB.makeRecord(5, 6);
        DB.makeRecord(6, 5);
        DB.makeRecord(7, 4);
        DB.makeRecord(8, 3);
        DB.makeRecord(9, 2);
        DB.makeRecord(10, 1);
        DB.closeConnection();
    }
}