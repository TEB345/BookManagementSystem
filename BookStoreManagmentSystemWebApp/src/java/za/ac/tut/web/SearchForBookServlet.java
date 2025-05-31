
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.BookFacadeLocal;
import za.ac.tut.entity.Book;

public class SearchForBookServlet extends HttpServlet {
    
    @EJB
    private BookFacadeLocal bfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long isbn = Long.parseLong(request.getParameter("isbn"));
        Book book = bfl.find(isbn);
        request.setAttribute("book", book);
        
        RequestDispatcher disp = request.getRequestDispatcher("searched_book_outcome.jsp");
        disp.forward(request, response);
    }

}
