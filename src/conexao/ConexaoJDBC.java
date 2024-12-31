package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBC {
    private static final String URL = "jdbc:postgresql://localhost:5432/OnTime";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão estabelecida com sucesso!");
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexão: " + e.getMessage());
            return null;
        }
    }
}
