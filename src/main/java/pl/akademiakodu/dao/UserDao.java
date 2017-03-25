package pl.akademiakodu.dao;

import pl.akademiakodu.model.User;

/**
 * Created by Andrzej on 07.12.2016.
 */
public interface UserDao {

    void save(User user);
    User get(int id);
}
