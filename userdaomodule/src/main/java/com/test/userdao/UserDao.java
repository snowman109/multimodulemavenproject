package com.test.userdao;

import com.test.dao.Dao;
import com.test.entity.User;

import java.util.*;

/**
 * TODO
 *
 * @author wyt
 * @date 2022/3/29 9:45
 */
public class UserDao implements Dao<User> {
    private final Map<Integer, User> users;

    public UserDao() {
        users = new HashMap<>();
        users.put(1, new User("banana"));
    }

    @Override
    public Optional<User> findById(int id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}
