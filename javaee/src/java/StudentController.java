import model.StudentModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;


@WebServlet(urlPatterns = {"/student"})
public class StudentController extends HttpServlet {
        //for view in browser http://localhost:8080/javaee/HelloWorld?nama=maria
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set response content type
        response.setContentType("text/html"); // application/json
        PrintWriter out = response.getWriter();
        int studID = Integer.parseInt(request.getParameter("id"));
        StudentModel stud = new StudentModel().getOne(studID);
        request.setAttribute("stud", stud); // forward to JSP
        
        RequestDispatcher dispatch = request.getRequestDispatcher("student_details.jsp");
        dispatch.forward(request,response);
//        out.println("<h1>" + this.message + nama + "</h1>");
    }
    
    
}

//---------\
