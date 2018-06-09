package dao;

import model.User;
import java.sql.*;

public class UserDao {
	public static User login(String userName, String password) {
        String sql="SELECT * FROM user WHERE name = ? AND password = ?";
        User user = null;
        Connection connection = null;

        try {
            connection = DBDao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, userName);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setUserName(userName);
                user.setPassword(password);
            }
            rs.close();
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBDao.closeConnection(connection);
        }
        return user;
    }

    public static boolean register(String userName, String password) {
        String selectSql = "SELECT * FROM user WHERE name=?";
        String insertSql_ua = "INSERT INTO user VALUES (?,?)";

        boolean isFind = false;
        boolean isSuccess = false;

        try {
            Connection connection = DBDao.getConnection();
            PreparedStatement statement = connection.prepareStatement(selectSql);
            statement.setString(1, userName);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                isFind = true;
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (!isFind) {
            try {
                Connection connection = DBDao.getConnection();

                PreparedStatement statement_ua = connection.prepareStatement(insertSql_ua);
                statement_ua.setString(1, userName);
                statement_ua.setString(2, password);
                statement_ua.executeUpdate();
                statement_ua.close();
                connection.close();
                isSuccess = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return isSuccess;
    }

}
