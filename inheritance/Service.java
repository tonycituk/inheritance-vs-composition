package inheritance;

public class Service extends DatabaseConnection {
    String name;

    public Service(String name) {
        super();
        this.name = name;
    }

    public void queryConnection() {
        String result = super.query();
        System.out.println(this.name + ": " + result);
    }
}