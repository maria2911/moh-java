package controllers;

import java.io.IOException;
import java.util.ArrayList;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ProjectModel; // komen 2 import model yg nak guna


@WebServlet(name = "Project", urlPatterns = {"/project"})
public class Project extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
        
        String action = request.getParameter("action");
        
        if(action != null){
            int id = (Integer.parseInt(request.getParameter("id")));
            ProjectModel pro = new ProjectModel();
            
            if(action.equals("Edit"))
            {
             // show original data
                pro = pro.getOne(id);
                request.setAttribute("project", pro);
                request.getRequestDispatcher("project/form.jsp").forward(request, response);
            }
            else if (action.equals("Del")){
                pro.delete(id);
            }
        }
        
        ArrayList list = new ProjectModel().getAll(); // if used import model spt komen 2
       // ArrayList list = new models.ProjectModel().getAll(); // jika x nak import model komen 2
       
       request.setAttribute("list",list);
       request.getRequestDispatcher("project/list.jsp").forward(request,response);
    }

  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
        
       String title = request.getParameter("title");
       String desription = request.getParameter("description");
       
       ProjectModel pro = new ProjectModel();
       pro.setTitle(title);
       pro.setDescription(desription);
       pro.insert();
        //request.getRequestDispatcher("project/list.jsp")
        response.sendRedirect("project");
    }

}
