
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Book Page</title>
    </head>
    <body>
        <h1>Search book</h1>
        <p><b>Enter the isbn of the book to look for</b></p>
        
        <form action="SearchForBookServlet.do" method="post">
            <table>
                <tr>
                    <td>Isbn:</td>
                    <td><input type="text" name="isbn"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="SEARCH"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
