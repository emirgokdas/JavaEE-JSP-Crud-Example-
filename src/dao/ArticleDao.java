package dao;

import java.sql.DriverManager;
import java.util.ArrayList;

import org.apache.catalina.User;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import bean.Articles;



public class ArticleDao {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Articles a){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into articles(artname,artcontent) values(?,?)");
			ps.setString(1,a.getArtname());
			ps.setString(2,a.getArtcontent());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(Articles a){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("update articles set artname=?,artcontent=? where id=?");
			ps.setString(1,a.getArtname());
			ps.setString(2,a.getArtcontent());
		    ps.setInt(6,a.getId());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(Articles a){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("delete from articles where id=?");
			ps.setInt(1,((Articles) a).getId());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
	public static List getAllRecords(){
		List list=(List) new ArrayList<User>();
		
		try{
			Connection con=getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from articles");
			ResultSet rs=(ResultSet) ps.executeQuery();
			while(rs.next()){
				Articles a =new Articles();
				a.setId(rs.getInt("id"));
				a.setArtname(rs.getString("artname"));
				a.setArtcontent(rs.getString("artcontent"));
			
				((ArrayList<Articles>) list).add(a);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static Articles getRecordById(int id){
		Articles a=null;
		try{
			Connection con=getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from articles where id=?");
			ps.setInt(1,id);
			ResultSet rs=(ResultSet) ps.executeQuery();
			while(rs.next()){
				a=(Articles) new Articles();
				a.setId(rs.getInt("id"));
				a.setArtname(rs.getString("artname"));
				a.setArtname(rs.getString("artcontent"));
			
			}
		}catch(Exception e){System.out.println(e);}
		return a;
	}
	}
