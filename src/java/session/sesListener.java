
package session;

import dba.dbConnect;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class sesListener implements HttpSessionListener{
	public void sessionCreated(HttpSessionEvent he){
		try{
	HttpSession session=he.getSession();
	dba.dbConnect db=new dba.dbConnect();
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