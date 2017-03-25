package pl.akademiakodu.dao;

import org.springframework.stereotype.Repository;
import pl.akademiakodu.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Andrzej on 06.12.2016.
 */

@Repository
public class BookDaoImpl implements BookDao{


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Book book) {
        entityManager.persist(book);
    }

    @Override
    @Transactional
    public Book get(int id) {
        return entityManager.find(Book.class,id);
    }
}
