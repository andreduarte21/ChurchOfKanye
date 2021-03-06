package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements UserServiceInterface {

    private List<User> usersList = new ArrayList<>();


    public List<User> getUsersList() {
        return usersList;
    }

    @Override
    public User getUser(Integer id) {
        return usersList.get(id);
    }

    @Override
    public void add(User user) {
        usersList.add(user);
    }

    @Override
    public void delete(User user) {
        usersList.remove(usersList.get(user.getId()-1));
    }

    @Override
    public void list() {
        usersList.forEach(System.out::println);
    }

}
