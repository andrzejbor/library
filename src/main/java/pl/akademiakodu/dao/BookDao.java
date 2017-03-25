package pl.akademiakodu.dao;

import pl.akademiakodu.model.Book;

/**
 * Created by Andrzej on 06.12.2016.
 */
public interface BookDao {

    void save(Book book);
    Book get(int id);
}
