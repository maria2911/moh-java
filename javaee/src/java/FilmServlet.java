import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import java.sql.DriverManager;
@WebServlet(urlPatterns = {"/film"})
public class FilmServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        PrintWriter out = response.getWriter();
        
    // connect to Mysql database
    try {
         Class.forName("com.mysql.jdbc.Driver"); // load driver
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root", ""); // tanpa zone time
         //conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root", "");
         stmt = conn.createStatement();
         String sql = "SELECT * FROM film";
         rs = stmt.executeQuery(sql);
         
         out.print("<table border='1'>");
         out.print("<tr>");
         out.print("<td>ID</td>");
         out.print("<td>TITLE</td>");
         //out.print("</tr>");
         out.print("<td>Description</td>");
         out.print("</tr>");
        
                
         while (rs.next ()){
             
            int id = rs.getInt("film_id");
            out.print("</tr>");
            out.print("<td>" + id + "</td>"); 
            out.print("<td>" + rs.getString("title") + "</td>");
            out.print("<td>" + rs.getString("description") + "</td>");
            out.println("</tr>");
            
         }
        out.print("</table>");
    }
    catch (Exception e){
            System.out.println("Berlaku error");
            System.out.println(e. getMessage());
    }
    
    // query
    
    
    // display result
    
    }

    
   
}
