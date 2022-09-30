/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import domain.Note;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.io.*;

/**
 *
 * @author Chris
 */
public class NoteServlet extends HttpServlet {
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String flag = request.getParameter("edit");
        System.out.println(flag==null?1:2);
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(path));
        String title = br.readLine();
//        System.out.println(title);
        String contents = br.readLine();
//        System.out.println(contents);
        Note notes = new Note(title,contents);
        br.close();
        request.setAttribute("title", notes.getTitle());
        request.setAttribute("contents", notes.getContents());
        if(flag == null){
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);   
        }else{
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        return;


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        String title = request.getParameter("editTitle");
        String contents = request.getParameter("editContents");
        Note notes = new Note(title,contents);
        pw.write(notes.getTitle()+"\n");
        pw.write(notes.getContents());
        pw.flush();
        pw.close();
        request.setAttribute("title", notes.getTitle());
        request.setAttribute("contents", notes.getContents());
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }
    
}
