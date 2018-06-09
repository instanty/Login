package dao;

import java.sql.*;

public class DBDao {
	private static String DB_URL = "jdbc:mysql://localhost:3306/text";
    private static String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static String DB_USER = "root";
    private static String DB_PASS = "";
    private static Connection connection = null;

    public static Connection getConnection(){
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (Exception e) {
            System.out.println("数据库连接异常");
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(Connection connection){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
