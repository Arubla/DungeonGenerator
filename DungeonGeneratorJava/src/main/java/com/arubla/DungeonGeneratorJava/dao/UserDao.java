package com.arubla.DungeonGeneratorJava.dao;

import com.arubla.DungeonGeneratorJava.model.User;

public interface UserDao {

    User getUserById(int userId);

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(int userId, String username, String password, int isAdmin);

    User updateUser(int userId, User user);

}
