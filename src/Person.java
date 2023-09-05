import java.util.ArrayList;

public class Person {
    private int personId;
    private String personName;
    private String telNumber;
    private String email;

    public Person (int personId, String personName, String telNumber, String email) {
        this.personId = personId;
        this.personName = personName;
        this.telNumber = telNumber;
        this.email = email;
    }

    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getTelNumber() {
        return telNumber;
    }
    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
