<%-- 
    Document   : editnote.jsp
    Created on : 29-Sep-2022, 1:30:40 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1> <br>
        <h3>Edit Note</h3> <br>
        <form action="note" method="POST">
            <label>Title:</label>
            <input type="text" name="editTitle" value="${title}">
            <br>
            <label>Contents:</label>
            <textarea name="editContents" cols="30" rows="10">${contents}</textarea>
            <br>
            <button type="submit">Save</button>
        </form>
    </body>
</html>
