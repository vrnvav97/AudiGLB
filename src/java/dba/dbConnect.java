
package dba;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnect {
  private Connection c;
  public Statement st;
  private PreparedStatement checkAdLogin,insertBooking;
    public dbConnect(){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
	  c=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/glbaudi","glbaudi","Glbaudi123");
          st=c.createStatement();  
        
          checkAdLogin=c.prepareStatement("select * from loginDetails where username=? and password=?");
       //   insertBooking=c.prepareStatement("insert into booking_info values(?,?,?,?,?,?,?,?,?)");
       
      }catch(Exception ex){
          ex.printStackTrace();
      }
    }
  
  public ResultSet checkAdLoginProcess(String e,String p){
      try {
          checkAdLogin.setString(1,e);  
          checkAdLogin.setString(2,p);
          ResultSet rs=checkAdLogin.executeQuery();
          if(rs.next()){
             return rs;
          }else{
             return null;
          }
      }catch (Exception ex) {
          return null;
      }
   }  
  public String insertAudiBookigProcess(String nameOfDepartment,String eventName,String typeOfEvent,String eventChiefGuest,
          java.sql.Date sdt,java.sql.Time time1,java.sql.Time time2,int eventGathering,String username){
      try {
          insertBooking.setString(1,nameOfDepartment);
          insertBooking.setString(2,eventName);
          insertBooking.setString(3,typeOfEvent);
          insertBooking.setString(4,eventChiefGuest);
          insertBooking.setDate(5,sdt);
          insertBooking.setTime(6,time1);
          insertBooking.setTime(7,time2);
          insertBooking.setInt(8,eventGathering);
          insertBooking.setString(9,username);
          int x=insertBooking.executeUpdate();
          if(x!=0){
             return "Success";
          }else{
             return "Failed";
          }
      }catch (java.sql.SQLIntegrityConstraintViolationException exp) {
          return "Already";
      }catch (SQLException ex) {
          return "Exception";
      }
   }

  public PreparedStatement getCheckLogin() {
        return checkAdLogin;
   }
}
