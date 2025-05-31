
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.Book;


@Local
public interface BookFacadeLocal {

    void create(Book book);

    void edit(Book book);

    void remove(Book book);

    Book find(Object id);

    List<Book> findAll();

    List<Book> findRange(int[] range);

    int count();
    
    void createBook(Book book);
    void editBook(Book book);
    void removeBook(Book book);
    
}
