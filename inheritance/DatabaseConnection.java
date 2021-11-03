package inheritance;

import java.util.UUID;

public class DatabaseConnection {
    String id;

    public DatabaseConnection() {
        this.id = UUID.randomUUID().toString();
        this.connect();
    }

    public void connect() {
        System.out.println(this.id + ": Succesfuly connected.");
    }

    public void disconnect() {
        System.out.println(this.id + ": Disconnected succesfuly");
    }

    public String query() {
        return String.format("Succesful query from [%s]", this.id);
    }
}