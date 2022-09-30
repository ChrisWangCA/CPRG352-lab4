
<%--
    Document   : viewnote.jsp
    Created on : 29-Sep-2022, 1:30:24 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
            <h1>Simple Note Keeper</h1> <br>
            <h3>View Note</h3> <br>
            <b>Title:${title}</b>
            <br>
            <br>
            <b>Contents:<br>${contents}</b>
            <br>
            <br>
            <a href="note?edit">Edit</a>
    </body>
</html>
