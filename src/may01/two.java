package may01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class two {
    static final String DB_URL = "jdbc:mysql://localhost:3306/java_db";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT id, first, last, age FROM Employees";
    public static void main(String[] args) {
    // Open a connection
    try(Connection conn = DriverManager.getConnection(DB_URL, USER, 
    PASS);
    Statement stmt = conn.createStatement();) {
    ResultSet rs = stmt.executeQuery(QUERY);
    int sum = 0;
    while (rs.next()) {
    // Retrieve by column name
    int a=rs.getInt("id"),b=rs.getInt("age");
    System.out.print("ID: " + rs.getInt("id"));
    System.out.print(", Age: " + rs.getInt("age"));
    System.out.print(", First: " + rs.getString("first"));
    System.out.println(", Last: " + rs.getString("last"));
    }
    } catch (SQLException e) {
    e.printStackTrace();
 }
 }
}
