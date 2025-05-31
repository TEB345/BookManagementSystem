
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rent Book Page</title>
    </head>
    <body>
        <h1>Rent a book</h1>
        <p><b>Enter the isbn of the book that you want to rent</b></p>
        
        <form action="RentBookServlet.do" method="post">
            <table>
                <tr>
                    <td>Isbn:</td>
                    <td><input type="text" name="isbn"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="RENT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
