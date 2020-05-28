import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class SimpleJDBC {
    public static void main(String[] args)
        throws SQLException, ClassNotFoundException {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Host: ");
            String host = input.nextLine();
            System.out.print("Enter Database: ");
            String database = input.nextLine();
            System.out.print("Enter user: ");
            String user = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();
            String url = "jdbc:postgresql://" + host + ":5432/" + database;
            Properties props = new Properties();
            props.setProperty("user", user);
            props.setProperty("password", password);

            Connection connection = DriverManager.getConnection(url, props);

            System.out.println("Connected to database");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM aviation.metars LIMIT 100");
            ResultSetMetaData rsmd = resultSet.getMetaData();
            System.out.println(rsmd.getColumnName(1) + " | " + rsmd.getColumnName(2));
            while (resultSet.next()) {
                    System.out.println(resultSet.getString("station_id") + "\t" + resultSet.getString("raw_text"));
            }
            connection.close();
    }
}
