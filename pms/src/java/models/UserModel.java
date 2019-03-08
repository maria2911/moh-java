package models;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 * BELAJAR TO LOGIN
 * @author Pengguna PC 09
 */
public class UserModel extends Model {
    
    private int id;
    private String stafId;
    private String pwd;
    private String role;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStafId() {
        return stafId;
    }

    public void setStafId(String stafId) {
        this.stafId = stafId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
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
                this.id = rs.getInt("id");
                this.pwd = rs.getString("pwd");
                this.stafId = rs.getString("role");
                this.name = rs.getString("name");
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