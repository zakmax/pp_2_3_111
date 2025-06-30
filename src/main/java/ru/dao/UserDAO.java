package ru.dao;

import org.springframework.stereotype.Component;
import ru.models.User;

import java.util.ArrayList;
import java.util.List;

@Component
public abstract class UserDAO {
     abstract List<User> index();
     abstract User show(int id);
     abstract void save(User user);
    abstract void update(int id, User updatedUser);
    abstract void delete(int id);
}