package pl.akademiakodu.dao;

import pl.akademiakodu.model.Person;

/**
 * Created by Andrzej on 07.12.2016.
 */
public interface PersonDao {

    void save(Person person);
    Person get(int id);
}
