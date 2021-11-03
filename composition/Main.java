package composition;

public class Main {
    public static void main(String[] args) {
        // Se crea UNA SOLA conexión a la base de datos
        DatabaseConnection connection = new DatabaseConnection();

        // Para instanciarlos, los servicios requieren de una conexión.
        Service s1 = new Service("CRUD Service", connection);
        Service s2 = new Service("Login Service", connection);

        // Vemos que las queries provienen de una sola conexión, la cual es la que
        // creamos en la línea 6.
        s1.query();
        s2.query();

        // Solo hay que cerrar la única conexión creada.
        connection.disconnect();
    }
}