
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabila
 */
public class Manufacturer implements IManufacturer{

    private int oid;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private Course course;
    private String details;
    
    public Manufacturer(int oid){
    
        this.oid = oid;
       
    }
    @Override
    public String getDetails() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
             String host = "jdbc:derby://localhost:1527/Course Factory";
             String uName = "nabila";
             String uPass = "123456";
             
             con = DriverManager.getConnection( host, uName, uPass );
             stmt = con.createStatement();
             String SQL = "SELECT * FROM COURSE_LIST";
             rs = stmt.executeQuery( SQL );
           
             while(rs.next())
             {
                 int id = rs.getInt("ID");
                 if(id == oid)
                 {
                     details = rs.getString("Description");
                     break;
                 }
             }
      
             
        }
        catch ( SQLException err ) {
             System.out.println( err.getMessage( ) );
        }
        
        return details;
    }
    
    
    
}
