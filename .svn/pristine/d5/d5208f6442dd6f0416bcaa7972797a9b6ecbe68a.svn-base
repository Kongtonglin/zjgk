package com.zjgk.jdbc;
import java.sql.*;
public class SqlSrvDBConn {
	private Statement stmt;
	private Connection conn;
	ResultSet rs;
	
	public SqlSrvDBConn(){
		stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/zjgk?useUnicode=true&characterEncoding=utf-8","root","9337ffaa");
			System.out.println("开始连接");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rs=null;
		
	}
	public Connection getConn(){
		return this.conn;
		
	}
	//ִ�в�ѯ���SQL��䣬�з��ؼ�
	 public ResultSet executeQuery(String sql){
		 try {
			stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("Data.executeQuery:"+e.getMessage());
		}
		 return rs;
	 }
	 public void closeStmt(){
		 try {
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("Data.executeQuery:"+e.getMessage());
		}
	 }
	 public void closeConn() {
		 try {
			conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("Data.executeQuery:"+e.getMessage());
		}
		
	}
}
