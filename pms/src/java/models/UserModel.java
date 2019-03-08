package models;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 * BELAJAR TO LOGIN
 * @author Pengguna PC 09
 */
public class UserModel extends Model {
    // return true jika staffid dan pwd matched
    public boolean isExist(String staffID, String pwd) {
        String sql = "SELECT * FROM users "
                + "WHERE staff_id ='" + staffID + "' "
                + "AND pwd = '" + pwd + "'";
        try 
        {
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next ()){
                return true; // user wujud
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false; /// user x wujud
    }
      
     public static void main(String[] args) {
         
        UserModel model = new UserModel();
        if(model.isExist("222", "123456")) {
            System.out.println("ok");
        }
        else {
            System.out.println("NOT ok");
        }
         
    }
             
}