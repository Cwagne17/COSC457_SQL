import config.ConnectionManager;
import java.sql.Connection;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection conn = ConnectionManager.getConnection();
        try {
            System.out.println(conn);
            String createDB = "CREATE DATABASE Students";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createDB);
        } catch (java.sql.SQLException exception) {
            exception.printStackTrace();
        }

    }
}