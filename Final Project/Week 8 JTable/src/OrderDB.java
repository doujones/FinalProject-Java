import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author doujones
 */
public class OrderDB {
   // class level constants
    
   private final String USER = "3562";
   private final String PASSWORD = "DeVry2020!";
   private final String DATABASENAME = "CIS355A_3562";
   private final String CONNSTRING = "jdbc:mysql://devry.edupe.net:8300/";
   
   public void add( Order custOrder ) throws ClassNotFoundException, SQLException
   {
       // check for JDBC Driver
       Class.forName("com.mysql.cj.jdbc.Driver");
       
       // connect to the database
       
       Connection conn = DriverManager.getConnection(
            CONNSTRING + DATABASENAME, USER, PASSWORD);
   
   // Write Order to Database
   String sqlStr = "INSERT INTO HOME-IMPROVEMENTS VALUE (?, ?, ?, ?, ?, ?) ";
   PreparedStatement pstmt = conn.prepareStatement(sqlStr);
   pstmt.setString(1, custOrder.getCustomerName());
   pstmt.setString(2, custOrder.getCustomerAddress());
   pstmt.setString(3, custOrder.getFlooringType());
   pstmt.setDouble(4, custOrder.getFloorLength());
   pstmt.setDouble(5, custOrder.getFloorCost());
   pstmt.setDouble(6, custOrder.getFloorWidth());
   
   pstmt.execute();
   
   conn.close();
   }
   
   public ArrayList<Order> getAll() throws ClassNotFoundException, SQLException
   {
       ArrayList<Order> list = new ArrayList<Order>();
       // check for JDBC Driver
       Class.forName("com.mysql.cj.jdbc.Driver");
       
       // connect to the database
       
       Connection conn = DriverManager.getConnection(
            CONNSTRING + DATABASENAME, USER, PASSWORD); 
       
       Statement stmt = conn.createStatement();
       ResultSet rs = stmt.executeQuery("SELECT * FROM HOME-IMPROVEMENTS");
       
       while( rs.next())
               {
               Order custOrder = new Order(   
               rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4),
                       rs.getDouble(5), rs.getDouble(6));
               list.add(custOrder);
       }
       
       conn.close();
       
       return list;
   }
}
