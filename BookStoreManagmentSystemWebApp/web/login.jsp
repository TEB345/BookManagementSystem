<%-- 
    Document   : login
    Created on : 12 May 2025, 10:20:01 AM
    Author     : TL Matenchi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <p>
            Please enter your login details below:
        </p>
        <form action="j_security_check" method="post">
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="j_username" required=""/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="j_password" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
