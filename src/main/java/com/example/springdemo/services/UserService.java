package com.example.springdemo.services;

import com.example.springdemo.models.User;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("ALL")
public class UserService extends DatabaseService {

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM \"User\"";

        try (Connection connection = getDataSource().getConnection(); // Sử dụng getDataSource()
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int userID = resultSet.getInt("UserID");
                String username = resultSet.getString("Username");
                String email = resultSet.getString("Email");
                String password = resultSet.getString("Password");
                String avatarUrl = resultSet.getString("AvatarUrl");
                String description = resultSet.getString("Description");
                int roleId = resultSet.getInt("RoleId");
                boolean canPost = resultSet.getBoolean("CanPost");
                boolean canComment = resultSet.getBoolean("CanComment");

                User user = new User(userID, username, email, password, avatarUrl, description, roleId, canPost, canComment);
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public List<Object> getUsersInfo() {
        List<Object> usersInfor = new ArrayList<>();
        String query = "SELECT Username, Password FROM \"User\"";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Map<String, Object> userInfor = new HashMap<>();
                userInfor.put("Username", resultSet.getString("Username"));
                userInfor.put("Password", resultSet.getString("Password"));
                usersInfor.add(userInfor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usersInfor;
    }


}
