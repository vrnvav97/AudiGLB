package db;

import java.sql.*;
import java.io.*;
public class DbConnect {
  private Connection connection;
  public Statement statement;
  private PreparedStatement checkLogin;

  public DbConnect(){
      try{
        Class.forName("com.mysql.jdbc.Driver");
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ptalkdb","root","king");
	statement=connection.createStatement();	
        
        checkLogin=connection.prepareStatement("select * from user_info where email=? and pass=? ");
       
      }catch(Exception ex){
          ex.printStackTrace();
      }
   }
  
  public ResultSet checkLoginProcess(String e,String p){
      try {
          checkLogin.setString(1,e);
          checkLogin.setString(2,p);
          ResultSet rs=checkLogin.executeQuery();
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
        return checkLogin;
   }
}
