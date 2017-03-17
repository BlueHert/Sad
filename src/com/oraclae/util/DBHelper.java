package com.oraclae.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
	private static final String driver=Reader.getReader().getProperty("driver");
	private static final String url=Reader.getReader().getProperty("url");
	private static final String username=Reader.getReader().getProperty("username");
	private static final String password=Reader.getReader().getProperty("password");
	
	
	static{
		try {
			Class.forName(driver);
			//System.out.println(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnetion(){
		Connection conn=null;
		try {
			
			conn=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeAll(Connection conn,Statement smt,ResultSet rs){
		try {
			if(conn!=null&&!conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(smt!=null){
				try {
					smt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(rs!=null){
						try {
							rs.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Connection conn=getConnetion();
		System.out.println(conn);
	}
}
