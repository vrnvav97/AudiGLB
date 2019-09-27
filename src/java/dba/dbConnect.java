
package dba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbConnect {
  private Connection c;
  public Statement st;
  private PreparedStatement checkAdLogin;
    public dbConnect(){
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection c=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/glbaudi","glbaudi","Glbaudi123");
          Statement st=c.createStatement();  
        
          checkAdLogin=c.prepareStatement("select * from loginDetails where username=? and password=?");
        
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
          ex.printStackTrace();
          return null;
      }
   }
  

  public PreparedStatement getCheckLogin() {
        return checkAdLogin;
   }
}
