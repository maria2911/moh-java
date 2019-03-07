package models;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProjectModel extends Model {
    private int id;
    private String title;
    private String description;
    
    public boolean insert(){
        String sql ="INSERT INTO project(title,description)" + 
        "VALUES('" + this.title +"', '" + this.description +"')";
        try {
            Statement stmt = this.getStmt();
            stmt.execute(sql);
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    
    // for delete-----------------
    public boolean delete(int id){
        String sql = "DELETE from project where id=" + id ;
        try {
            Statement stmt = this.getStmt();
            stmt.execute(sql);
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
   //-----------delete----------------------------------- 
   //-----------edit-----------------------------------  
    // record 1 rekod
    public ProjectModel getOne(int id){
        String sql = "SELECT * FROM project WHERE id =" +id;
        ProjectModel pro = new ProjectModel();
        try {
                Statement stmt = this.getStmt();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next ())   {
               
                    pro.id = rs.getInt("id");
                    pro.title = rs.getString("title");
                    pro.description = rs.getString("description");
                }
            }
            catch (Exception e){
                 e.printStackTrace();
                }
            return pro;
    }
    
    //edit----------------------------------
    public ArrayList getAll(){
        ArrayList arr = new ArrayList();
        
        String sql = "SELECT * FROM project";
        try {
            Statement stmt = this.getStmt();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next ()){
                ProjectModel pro = new ProjectModel(); // nama class kita yang di create
                pro.id = rs.getInt("id");
                pro.title = rs.getString("title");
                pro.description = rs.getString("description");
                arr.add(pro);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return arr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    
    // buat untuk check ke dbase
    public static void main(String[] args){
    ProjectModel p = new ProjectModel();
    
    //for test data
    p.setTitle("test");
    p.setDescription("try it");
    p.insert();
    
    ArrayList list = p.getAll();
    for (int i=0; i<list.size(); i++){
        ProjectModel pro = (ProjectModel) list.get(i);
        System.out.println(pro.title);
        }
    }

    
    
//    public void insert() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
}
