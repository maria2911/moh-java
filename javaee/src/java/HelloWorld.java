import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/HelloWorld"})
public class HelloWorld extends HttpServlet {

    private String message;
    
    @Override
    public void init() throws ServletException
    {
      // do required initialization
      message ="Hello World :  ";
    }
      
    //for view in browser http://localhost:8080/javaee/HelloWorld?nama=maria
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set response content type
        response.setContentType("text/html"); // tidak wajib
        //Actual logic goes here
        PrintWriter out = response.getWriter();
        String nama = request.getParameter("nama");
        out.println("<h1>" + this.message + nama + "</h1>");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set response content type
        String nama = request.getParameter("nama");
        int umur = Integer.parseInt(request.getParameter("umur"));
       
        //Actual logic goes here
        PrintWriter out = response.getWriter();
        out.println("<h1>" + nama + " umur sekarang " + umur + "</h1>");
    }
}
