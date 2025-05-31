
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Books Page</title>
    </head>
    <body>
        <h1>View books</h1>
        <p><b>Click the button below to view all the available books </b></p>
        <form action="ViewBooksServlet.do" method="post">
            <table>
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET ALL BOOKS"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
