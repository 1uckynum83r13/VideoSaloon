import java.util.Date;

public class Record {
    private int recordId;
    private int personId;
    private int managerId;
    private int gameExemplaryID;
    private int dateOfRent;
    private int getDateOfReturn;

    public Record(int recordId, int personId, int managerId, int gameExemplaryID, int dateOfRent, int getDateOfReturn) {
        this.recordId = recordId;
        this.personId = personId;
        this.managerId = managerId;
        this.gameExemplaryID = gameExemplaryID;
        this.dateOfRent = dateOfRent;
        this.getDateOfReturn = getDateOfReturn;
    }
}
