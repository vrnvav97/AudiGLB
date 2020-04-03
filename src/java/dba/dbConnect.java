
package dba;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnect {
  private Connection c;


private Statement st,adminAllHis,viewPending,cancelledRequest;

  private PreparedStatement checkAdLogin,insertBooking,viewHistory,getUser,allowAudi,
          cancelAudi,historyCancelUser,historyCancelAdmin;
  
    public dbConnect(){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
	  c=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/glbaudi","glbaudi","Glbaudi123");
          st=c.createStatement();  
        
          checkAdLogin=c.prepareStatement("select * from loginDetails where username=? and password=?");
          getUser=c.prepareStatement("select * from loginDetails where username=?");
        
          insertBooking=c.prepareStatement("INSERT INTO `audiDetails` (`nameOfDepartment`, `eventName`, `typeOfEvent`, `eventChiefGuest`, `eventDate`, `time1`, `time2`, `eventGathering`, `username`,`audiAssigned`,`request`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
          viewHistory = c.prepareStatement("Select * from audiDetails where username = ?");
          allowAudi = c.prepareStatement("UPDATE audiDetails set audiAssigned=?,request=? where bookingID=?");
          cancelAudi = c.prepareStatement("UPDATE audiDetails set request=? where bookingID=?");
          historyCancelUser =c.prepareStatement("delete from audiDetails where bookingID=?");
          historyCancelAdmin = c.prepareStatement("UPDATE audiDetails set audiAssigned=?,request=? where bookingID=?");
          
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
          java.sql.Date sdt,String time1,String time2,int eventGathering,String username){
      try {
          insertBooking.setString(1,nameOfDepartment);
          insertBooking.setString(2,eventName);
          insertBooking.setString(3,typeOfEvent);
          insertBooking.setString(4,eventChiefGuest);
          insertBooking.setDate(5,sdt);
          insertBooking.setString(6,time1);
          insertBooking.setString(7,time2);
          insertBooking.setInt(8,eventGathering);
          insertBooking.setString(9,username);
          insertBooking.setString(10,"NotApprovedByAdmin");
          insertBooking.setInt(11,0);
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
  public ResultSet getUser(String e){
      try {
          getUser.setString(1,e);
          ResultSet rs=getUser.executeQuery();
          if(rs.next()){
             return rs;
          }else{
             return null;
          }
      }catch (SQLException ex) {
          return null;
      }
   }
  public PreparedStatement getCheckLogin() {
        return checkAdLogin;
   }
  public ResultSet history (String username)
  {
      ResultSet rs=null;
      try
      {
      viewHistory.setString(1, username);
       rs = viewHistory.executeQuery();
      }
      catch (Exception e)
      {
          System.out.println ("Error occured");
      }
      return rs;
  }

  public ResultSet pendingRequest ()
  {
      ResultSet rs=null;
      try
      {
        viewPending = c.createStatement();
       rs = viewPending.executeQuery("Select * from audiDetails where request =0");
      }
      catch (Exception e)
      {
          System.out.println ("Error occured");
      }
      return rs;
  }
  
  public ResultSet cancelledRequest ()
  {
      ResultSet rs=null;
      try
      {
        cancelledRequest = c.createStatement();
       rs = cancelledRequest.executeQuery("Select * from audiDetails where request =2");

      }
      catch (Exception e)
      {
          System.out.println("Error occured");
      }
      return  rs;
  }
  
  public ResultSet adminAllHistory ()
  {
      
      ResultSet rs=null;
      try
      {
       adminAllHis = c.createStatement();
       rs = adminAllHis.executeQuery("Select * from audiDetails");

      }
      catch (Exception e)
      {
          System.out.println ("Error occured");
      }
      return rs;
  }
  
  public String allowAudi(int bid,String audiName) throws SQLException{
      
      allowAudi.setString(1, audiName);
      allowAudi.setInt(2, 1);
      allowAudi.setInt(3, bid);
      int x = allowAudi.executeUpdate();
      if (x == 1) {
            return "Audi Allocated Successfully";
        } else {
            return "Try Again!";
        }
  }
  
  public String cancelAudi(int bid) throws SQLException{
      
     
      cancelAudi.setInt(1, 2);
      cancelAudi.setInt(2, bid);
      int x = cancelAudi.executeUpdate();
      if (x == 1) {
            return "Cancelled Audi Request";
        } else {
            return "Try Again!";
        }
  }
  
  public String historyCancelUser(int bid) throws SQLException{
      
     
      historyCancelUser.setInt(1, bid);
      int x = historyCancelUser.executeUpdate();
      if (x == 1) {
            return "You have Cancelled your Audi Request Succesfully!";
        } else {
            return "Try Again!";
        }
  }
  
  public String historyCancelAdmin(int bid) throws SQLException{
      
     
      historyCancelAdmin.setString(1,"NotApprovedByAdmin");
      historyCancelAdmin.setInt(2,1);
      historyCancelAdmin.setInt(3, bid);
      int x = historyCancelAdmin.executeUpdate();
      if (x == 1) {
            return "You have Cancelled Allocated Audi, Open Pending request section to allocate Audi again!";
        } else {
            return "Try Again!";
        }
  }
  

}
