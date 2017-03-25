package pl.akademiakodu.dao;

import org.springframework.stereotype.Repository;
import pl.akademiakodu.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Andrzej on 07.12.2016.
 */

@Repository
public class PersonDaoImpl implements PersonDao {


    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(Person person) {
        entityManager.persist(person);
    }

    @Override
    @Transactional
    public Person get(int id) {
        return entityManager.find(Person.class,id);
    }
}
