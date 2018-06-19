package artifex;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class Connect {

    Service hp=new Service();

    String JDBC_DRIVER = hp.getJDBC_DRIVER();
    String DB_URL =hp.getDB_URL();


    String USER = hp.getUSER();
    String PASS = hp.getPASS();
    Connection conn=null;
    PreparedStatement stmt=null;

    ResultSet rs;
    Statement st;


    //String id;


    public void insert(String fname,String lname,String email,String uname,String psw){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);


            stmt=conn.prepareStatement("insert into members VALUES (?,?,?,?,?)");



            stmt.setString(1,fname);
            stmt.setString(2,lname);
            stmt.setString(3,email);
            stmt.setString(4,uname);
            stmt.setString(5,psw);



            stmt.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.print("Inserted");

        try {
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void doArticle(String name,String content){
    	
    	  try {
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection(DB_URL, USER, PASS);


              stmt=conn.prepareStatement("insert into articles VALUES (null,?,?)");



              stmt.setString(1,name);
              stmt.setString(2,content);
           


              stmt.executeUpdate();

          } catch (ClassNotFoundException e) {
              e.printStackTrace();
          } catch (SQLException e) {
              e.printStackTrace();
          }

          System.out.print("gönderildi");

          try {
              stmt.close();
              conn.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }	
    	
    	
    }
    
