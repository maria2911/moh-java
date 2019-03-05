package chap22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Film { 
    
    protected void list() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        // list all film title and desc
    try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root", "");
         stmt = conn.createStatement();
         String sql = "SELECT * FROM film";
         rs = stmt.executeQuery(sql);
         while (rs.next ()){
             //System.out.println(rs.getString("title"));
            int id = rs.getInt("film_id"); //integer + string akan jadi string
            System.out.print(id + "\t");
            System.out.print(rs.getString("title") +"\t\t");
            System.out.println(rs.getString("description"));
         }
        
    }
    catch (Exception e){
            System.out.println("Berlaku error");
            System.out.println(e. getMessage());
    }
 }      
    
    public static void main(String[] args) {
        Film f = new Film();
        f.list();
        
        
// list all film title and desc
// trty.catch = exception / error handling
// cod eberada dlm try, catch bila berlaku error

 }
   
}
