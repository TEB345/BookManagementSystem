
package za.ac.tut.bl;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entity.Book;


@Stateless
public class BookFacade extends AbstractFacade<Book> implements BookFacadeLocal {

    @PersistenceContext(unitName = "BookStoreEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookFacade() {
        super(Book.class);
    }

    @RolesAllowed("admin")
    @Override
    public void createBook(Book book) {
        create(book);
    }

    @RolesAllowed("admin")
    @Override
    public void editBook(Book book) {
        edit(book);
    }

    @RolesAllowed("admin")
    @Override
    public void removeBook(Book book) {
        remove(book);
    }
    
}
