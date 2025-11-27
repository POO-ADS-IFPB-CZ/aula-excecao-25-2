import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("","","")){
            System.out.println(10/0);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void criarArquivo(String arquivo)
            throws IOException{
        throw new IOException("Exceção");
    }

}
