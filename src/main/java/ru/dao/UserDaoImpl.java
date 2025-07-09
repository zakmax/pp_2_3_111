package ru.dao;

import org.springframework.stereotype.Repository;
import ru.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDAO {






    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(User user) {
          entityManager.persist(user);
    }
         @Override
        public List<User> index() {

        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
            public User show(int id) {

       return entityManager.find(User.class, id);
        }

    @Override
            public void update(int id, User updatedUser){

        entityManager.merge(updatedUser);
        }
        @Override
                public  void delete(int id) {

        entityManager.remove(show(id));
        }

}
