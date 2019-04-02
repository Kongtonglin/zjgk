package com.zjgk.servelt;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.zjgk.jdbc.SqlSrvDBConn;
 

public class Check extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			response.setCharacterEncoding("utf-8");
			int j=0;
			int x=1;
			String[] i=new String[5];
		 	String major = (String) request.getParameter("major");
			String school_num = (String) request.getParameter("num");
			String subject = (String) request.getParameter("subject");
			subject=new String(subject.getBytes("iso8859-1"),"utf-8");
			SqlSrvDBConn mysqldb=new SqlSrvDBConn();
			HttpSession session=request.getSession();
			session.setAttribute("major",major);
			session.setAttribute("school_num",school_num);
			session.setAttribute("subject",subject);
			String sql="SELECT id,subject1,subject2,subject3,major"+major+" FROM k_free_majors_"+school_num+" WHERE CONCAT(`subject1`,`subject2`,`subject3`) NOT LIKE '%"+subject+"%'ORDER BY major"+major+"  DESC LIMIT 3";  
			ResultSet rs=mysqldb.executeQuery(sql);
			try {
				
				while(rs.next())
				{  
					i[0]=rs.getString(2);
					i[1]=rs.getString(3);
					i[2]=rs.getString(4);
					j++;
					if(j==1)
					{
						session.setAttribute("array1_1",i[0]);
						session.setAttribute("array1_2",i[1]);
						session.setAttribute("array1_3",i[2]);						
					}
					else if(j==2)
					{
						session.setAttribute("array2_1",i[0]);
						session.setAttribute("array2_2",i[1]);
						session.setAttribute("array2_3",i[2]);						
					}
					else if(j==3)
					{
						session.setAttribute("array3_1",i[0]);
						session.setAttribute("array3_2",i[1]);
						session.setAttribute("array3_3",i[2]);					
						break;
					}
					
				 }
				session.setAttribute("x",x);
				response.sendRedirect("optional.jsp");
				rs.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			mysqldb.closeStmt();
			
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
