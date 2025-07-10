package ru.dao;
import ru.models.User;
import java.util.List;


public interface UserDAO {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}