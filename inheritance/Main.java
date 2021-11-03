package inheritance;

public class Main {
    public static void main(String[] args) {
        // Al extender de DatabaseConnection, cada instancia de Service crea su propia
        // conexión, lo cual puede ser ineficiente porque mientras más servicios se
        // creen, mas conexiones a una base de datos existiran.
        Service s1 = new Service("CRUD Service");
        Service s2 = new Service("Login Service");

        // Vemos que las queries vienen de conexiones diferentes.
        s1.queryConnection();
        s2.queryConnection();

        // Tenemos que asegurarnos de cerrar todas las conexiones creadas.
        s1.disconnect();
        s2.disconnect();
    }
}