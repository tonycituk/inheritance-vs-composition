package composition;

import java.util.UUID;

public class DatabaseConnection {
    String id;
    Boolean connected = false;

    public DatabaseConnection() {
        this.id = UUID.randomUUID().toString();
        this.connect();
    }

    public void connect() {
        if (!this.connected) {
            System.out.println(this.id + ": Succesfully connected");
            this.connected = true;
        } else {
            System.out.println(this.id + ": Connection already exists");
        }
    }

    public void disconnect() {
        if (this.connected) {
            System.out.println(this.id + ": Disconnected succesfuly");
            this.connected = false;
        }
    }

    public String query() throws Exception {
        if (!this.connected)
            throw new Exception(this.id + ": Connection is closed");
        return String.format("Succesful query from connection [%s]", this.id);
    }
}