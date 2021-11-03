package composition;

public class Service {
    String name;

    // Dependency
    DatabaseConnection databaseConnection;

    public Service(String name, DatabaseConnection databaseConnection) {
        this.name = name;
        this.databaseConnection = databaseConnection;
    }

    public void query() {
        try {
            String result = this.databaseConnection.query();
            System.out.println(this.name + ": " + result);
        } catch (Exception e) {
            System.out.println(this.name + ": Connection is closed");
        }
    }
}