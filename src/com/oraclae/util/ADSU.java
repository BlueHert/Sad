package com.oraclae.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ltt.entiry.Book;

public abstract class ADSU {

	public int update(String sql, Object... params) {
		Connection conn=DBHelper.getConnetion();
		int i=0;
		try {
			PreparedStatement psmt=conn.prepareStatement(sql);
			if(params!=null){
				for (int j = 0; j < params.length; j++) {
					psmt.setObject(j+1, params[j]);
				}
			}
			i=psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	// ��ѯ
	public ArrayList<Book> query(String sql, Object... params) {
		Connection conn = DBHelper.getConnetion();
		PreparedStatement psmt=null;	
		ArrayList<Book> list = new ArrayList<Book>();
		ResultSet rs=null;
		try {
			psmt = conn.prepareStatement(sql);
			// ����ռλ��
			if (params != null && params.length > 0) {
				for (int i = 0; i < params.length; i++) {
					psmt.setObject(i + 1, params[i]);
				}
			}
			// ִ��
			rs=psmt.executeQuery();
			// ��������						
			list= getDataFromResultSet(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	//���������ķ���
	public abstract <T> ArrayList<T> getDataFromResultSet(ResultSet rs) throws SQLException;


}


