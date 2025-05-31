<%-- 
    Document   : add_books
    Created on : Apr 30, 2025, 6:37:35 PM
    Author     : cash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Book Page</title>
    </head>
    <body>
        <h1>Add books</h1>
        <p>
            <b>Enter the details of the book to be added into the database</b>
        </p>

        <form action="AddBookServlet.do" method="post">
            <table>
                <tr>
                    <td>Book isbn:</td>
                    <td><input type="text" name="isbn"/></td>
                </tr>
                <tr>
                    <td>Title:</td>
                    <td><input type="text" name="title"/></td>
                </tr>
                <tr>
                    <td>Author name: </td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Author surname:</td>
                    <td><input type="text" name="surname"/></td>
                </tr>
                <tr>
                    <td>Publication date:</td>
                    <td><input type="date" name="pb"/></td>
                </tr>
                 <tr>
                    <td>Price:</td>
                    <td><input type="text" name="price"/></td>
                </tr>
                 <tr>
                     <td>Quantity in store:</td>
                    <td><input type="text" name="stock"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD BOOK"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
