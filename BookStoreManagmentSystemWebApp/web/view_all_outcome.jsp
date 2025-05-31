

<%@page import="java.util.Date"%>
<%@page import="za.ac.tut.entity.Book"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View All Books Outcome Page</title>
    </head>
    <body>
        <h1>View Available Books:</h1>
        <%
            List<Book> list = (List<Book>)request.getAttribute("list");
        %>
        <table>
            <%
                for(int i=0;i<list.size();i++){
                    Book b = list.get(i);
                    Long isbn = b.getIsbn();
                    String title = b.getTitle();
                    String name = b.getName();
                    String surname = b.getSurname();
                    Double price = b.getPrice();
                    Integer stock = b.getStock();
                    Date pb = b.getPb();
                
            %>
            <tr>
                    <td>Book isbn:</td>
                    <td><%=isbn%></td>
                </tr>
                <tr>
                    <td>Title:</td>
                    <td><%=title%></td>
                </tr>
                <tr>
                    <td>Author name: </td>
                    <td><%=name%></td>
                </tr>
                <tr>
                    <td>Author surname:</td>
                    <td><%=surname%></td>
                </tr>
                <tr>
                    <td>Publication date:</td>
                    <td><%=pb%></td>
                </tr>
                 <tr>
                    <td>Price:</td>
                    <td><%=price%></td>
                </tr>
                 <tr>
                     <td>Quantity in store:</td>
                    <td><%=stock%></td>
                </tr>
                <%
                    }
                %>
        </table>
        <p>
            Click <a href="index.html">here</a> to go back.
            Click <a href="LogoutServlet.do">here</a> to logout.
        </p>
    </body>
</html>
