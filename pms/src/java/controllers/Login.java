
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.UserModel;


@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {
    
    // for logout
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        session.invalidate(); // destroy session
        response.sendRedirect("/pms/pub/login.jsp");
   
}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String staffId = request.getParameter("staff_id");
        String pwd = request.getParameter("pwd");
        UserModel user = new UserModel();
        
        if(user.isExist(staffId, pwd)) {
            // user wujud
                     
            HttpSession sess = request.getSession();
            sess.setAttribute("loggedin", true);
            sess.setAttribute("user", user); // simpan maklumat user yg login
            response.sendRedirect("/pms/project");
        }
        else {
            // user x wujud
            response.sendRedirect("/pms/pub/login.jsp?no");
        }

}


}