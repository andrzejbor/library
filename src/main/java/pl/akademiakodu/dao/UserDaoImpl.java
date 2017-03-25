package pl.akademiakodu.dao;

import org.springframework.stereotype.Repository;
import pl.akademiakodu.model.User;
import pl.akademiakodu.model.UserDetails;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Andrzej on 07.12.2016.
 */

@Repository
public class UserDaoImpl implements UserDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(User user) {
        UserDetails details = user.getUserDetails();
        if (details != null && details.getId() == null){
            entityManager.persist(details);
        }
        entityManager.persist(user);
    }

    @Override
    @Transactional
    public User get(int id) {
        return entityManager.find(User.class,id);
    }
}
