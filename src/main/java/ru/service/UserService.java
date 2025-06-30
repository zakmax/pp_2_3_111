package ru.service;


import org.springframework.stereotype.Service;
import ru.models.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static int USERS_COUNT;
    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(++USERS_COUNT, "Tom"));
        users.add(new User(++USERS_COUNT, "Bob"));
        users.add(new User(++USERS_COUNT, "Mike"));
        users.add(new User(++USERS_COUNT, "Katy"));
    }

    public List<User> index() {

        return users;
    }

    public User show(int id) {

        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);


    }

    public void save(User user) {
        user.setId(++USERS_COUNT);
        users.add(user);
    }

    public void update(int id, User updatedUser) {
        User userToBeUpdated = show(id);

        userToBeUpdated.setName(updatedUser.getName());

    }

    public void delete(int id) {
        users.removeIf(p -> p.getId() == id);
    }

}



