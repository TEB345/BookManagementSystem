package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.BookFacadeLocal;
import za.ac.tut.entity.Book;

public class RentBookServlet extends HttpServlet {
    
    
    @EJB
    private BookFacadeLocal bfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        long isbn = Long.parseLong(request.getParameter("isbn"));
        
        Book book = bfl.find(isbn);
        int num = book.getStock();
        
        if(num != 0)
        {
            num--;
            book.setStock(num);
            bfl.edit(book);
        }
        
        Double total = (Double) session.getAttribute("total");
        List<Book> books = (List<Book>) session.getAttribute("books");
        
        books.add(book);
        total = total + book.getPrice();
        
        request.setAttribute("books", books);
        request.setAttribute("total", total);
        
        session.setAttribute("books", books);
        session.setAttribute("total", total);
        
        RequestDispatcher disp = request.getRequestDispatcher("rent_book_outcome.jsp");
        disp.forward(request, response);
    }

}
