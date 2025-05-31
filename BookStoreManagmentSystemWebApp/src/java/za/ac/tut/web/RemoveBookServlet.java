/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.BookFacadeLocal;
import za.ac.tut.entity.Book;


public class RemoveBookServlet extends HttpServlet {
    
    @EJB
    private BookFacadeLocal bfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long isbn = Long.parseLong(request.getParameter("isbn"));
        
        Book book = bfl.find(isbn);
        bfl.removeBook(book);
        
        RequestDispatcher disp = request.getRequestDispatcher("removed_book_outcome.jsp");
        disp.forward(request, response);
        
    }

}
