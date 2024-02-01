import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Connect to the MySQL database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "");

            // Create a Statement object
            Statement stmt = conn.createStatement();

            // Execute a SQL query
            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");

            // Process the query results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                System.out.println(id + "\t" + name + "\t" + price);
            }

            // Close the resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
