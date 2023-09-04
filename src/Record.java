import java.util.Date;

public class Record {

    private Person customer;
    private Game game;
    private Date date;

    public Record(Person customer, Game game) {
        this.customer = customer;
        this.game = game;
        this.date = new Date();
    }
}
