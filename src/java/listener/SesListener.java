package listener;

import db.DbConnect;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class SesListener implements HttpSessionListener{
	public void sessionCreated(HttpSessionEvent he){
		try{
	HttpSession session=he.getSession();
	db.DbConnect db=new db.DbConnect();
        session.setAttribute("db",db);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public void sessionDestroyed(HttpSessionEvent he){
		try{
	HttpSession session=he.getSession();				
	session.setAttribute("db",null);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}