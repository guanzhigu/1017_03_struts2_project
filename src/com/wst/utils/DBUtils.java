package com.wst.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
	private final String DBDRIVER = "com.mysql.jdbc.Driver";
	private final String DBURL = "jdbc:mydql://localhost:3306/day1017?useUnicode=true&characterEncoding=utf8";
	private final String DBUSER = "root";
	private final String DBPASSWORD = "root";
	private Connection conn = null;
	
	public DBUtils(){
		try{
			Class.forName(DBDRIVER);
			this.conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		return this.conn;
	}
	
	public void close(){
		try{
			this.conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
