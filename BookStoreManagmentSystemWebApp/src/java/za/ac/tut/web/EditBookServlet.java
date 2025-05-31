/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.BookFacadeLocal;
import za.ac.tut.entity.Book;

/**
 *
 * @author thabo
 */
public class EditBookServlet extends HttpServlet {
    
    @EJB
    private BookFacadeLocal bfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            Long isbn = Long.parseLong(request.getParameter("isbn"));
            String title = request.getParameter("title");
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            Double price = Double.parseDouble(request.getParameter("price"));
            Integer stock = Integer.parseInt(request.getParameter("stock"));
        
            String pbStr = request.getParameter("pb");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            Date pb = sdf.parse(pbStr);
        
            Book book = bfl.find(isbn);
            book.setTitle(title);
            book.setName(name);
            book.setSurname(surname);
            book.setPb(pb);
            book.setPrice(price);
            book.setStock(stock);
            bfl.editBook(book);
            
            RequestDispatcher disp = request.getRequestDispatcher("edited_book_outcome.jsp");
            disp.forward(request, response);
                    
        }catch(ParseException ex){
            Logger.getLogger(EditBookServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
