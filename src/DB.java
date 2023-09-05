import java.sql.*;
import java.util.Date;

public class DB {
    private static Connection connection;
    private static final String database = "VideoSaloon.db";
    private static final String recordsTable = "record";
    private static final String gameCatalog = "gameCatalog";
    private static final String personTable = "personTable";
    static void openConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:" + database);
    }
    static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    static void CreateTableForCatalog() throws SQLException {
        Statement statement = connection.createStatement();
        String SQL = """
                CREATE TABLE IF NOT EXISTS gameCatalog (
                    ID INTEGER PRIMARY KEY AUTOINCREMENT,
                    gameName STRING,
                    gameGenre STRING,
                    gamePublishingYear INTEGER
                 )""";
        statement.executeUpdate(SQL);
    }

    static void addGame(String gameName, String gameGenre, int gamePublishingYear) throws SQLException {
        String SQL = "INSERT INTO " + gameCatalog + " (gameName, gameGenre, gamePublishingYear) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        preparedStatement.setString(1, gameName);
        preparedStatement.setString(2, gameGenre);
        preparedStatement.setInt(3, gamePublishingYear);

        preparedStatement.executeUpdate();

        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
        if (generatedKeys.next()) {
            System.out.format("Добавлена игра %s с ID: %d \n",
                    gameName, generatedKeys.getLong(1));
        }
    }

    static void CreateRecordsTable() throws SQLException {
        Statement statement = connection.createStatement();
        String SQL = """
                CREATE TABLE IF NOT EXISTS adoption_records (
                    ID INTEGER PRIMARY KEY AUTOINCREMENT,
                    personID INTEGER,
                    gameExemplaryId INTEGER,
                    dateOfRent DATETIME,
                    dateOfReturn DATETIME
                 )""";
        statement.executeUpdate(SQL);
    }
    static void makeRecord(int personID, int gameExemplaryId) throws SQLException {
        String SQL = "INSERT INTO " + recordsTable + " (personID, gameExemplaryId, dateOfRent, dateOfReturn) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL);

        preparedStatement.setInt(1, personID);
        preparedStatement.setInt(2, gameExemplaryId);
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
        preparedStatement.setTimestamp(3, currentTimestamp);
        preparedStatement.setNull(4, Types.TIMESTAMP);


        preparedStatement.executeUpdate();
    }

    static void CreateTableForPerson() throws SQLException {
        Statement statement = connection.createStatement();
        String SQL = """
                CREATE TABLE IF NOT EXISTS personTable (
                    ID INTEGER PRIMARY KEY AUTOINCREMENT,
                    personName STRING,
                    telNumber STRING,
                    email STRING
                 )""";
        statement.executeUpdate(SQL);
    }
    static void addPerson(String personName, String telNumber, String email) throws SQLException {
        String SQL = "INSERT INTO " + personTable + " (personName, telNumber, email) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        preparedStatement.setString(1, personName);
        preparedStatement.setString(2, telNumber);
        preparedStatement.setString(3, email);

        preparedStatement.executeUpdate();

//        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
//        if (generatedKeys.next()) {
//            System.out.format("Добавлен клиент %s с ID: %d \n",
//                    personName, generatedKeys.getLong(1));
//        }
    }
}
