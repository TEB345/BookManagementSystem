<%-- 
    Document   : remove_books
    Created on : Apr 30, 2025, 6:48:41 PM
    Author     : cash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Book Page</title>
    </head>
    <body>
        <h1>Remove book</h1>
        <p><b>Enter the ISBN of the book to be deleted</b></p>
        
        <form action="RemoveBookServlet.do" method="post">
            <table>
                <tr>
                    <td>Isbn:</td>
                    <td><input type="text" name="isbn"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="DELETE"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
