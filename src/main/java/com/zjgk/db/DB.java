package com.zjgk.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DB {
 /**
  * @param args
  */
 private static String url="jdbc:mysql://localhost:3306/zjgk";
 private static String name="root";
 private static String password="9337ffaa";

 public static Connection getConntion() {
		try{
			//������������
			   Class.forName("com.mysql.jdbc.Driver");
			Connection conn;
			  //������ݿ����ӣ�
			   conn=DriverManager.getConnection(url,name,password);
			return conn;
		}catch (ClassNotFoundException e){
		   e.printStackTrace();
		   return null;
		}
		catch (SQLException e){
			   e.printStackTrace();
			   return null;
			}
	}
	
	public static void closeConn(Connection con, PreparedStatement pstm,
			ResultSet rs){
		try{
			if(rs != null){
				rs.close();
				rs=null;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstm != null) {
				pstm.close();
				pstm = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (con != null)
			con.close();
			con = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}