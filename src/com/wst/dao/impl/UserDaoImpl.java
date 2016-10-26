package com.wst.dao.impl;

import java.io.Serializable;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.wst.dao.UserDao;
import com.wst.domain.User;
import com.wst.utils.DBUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUserByUAndP(String username, String password) {
		// TODO Auto-generated method stub
		String SQL = "select * from S_User u where u.username=? and u.password=?";
		DBUtils dbc = null;
		PreparedStatement pstm = null;
		dbc = new DBUtils();
		User userInfo = null;
		try{
			pstm = dbc.getConnection().prepareStatement(SQL);
			pstm.setString(1, username.trim());
			pstm.setString(2, password);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				userInfo = new User();
			}
			rs.close();
			pstm.close();
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
			try{
				throw new Exception("链接数据库出错！");
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}
		finally{
			dbc.close();
		}
		return userInfo;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> all = new ArrayList<User>();
		String sql = "select * from S_User u";
		PreparedStatement pstmt = null;
		DBUtils dbc = null;
		try{
			dbc = new DBUtils();
			pstmt = dbc.getConnection().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				User user = new User();
				user.setUserID(rs.getLong("userid"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setSex(rs.getString("sex"));
				user.setBirthday(rs.getDate("birthday"));
				user.setEducation(rs.getString("education"));
				user.setTelephone(rs.getString("telephone"));
				user.setInterest(rs.getString("interest"));
				user.setPath(rs.getString("path"));
				user.setFilename(rs.getString("filename"));
				user.setRemark(rs.getString("remark"));
				all.add(user);
			}
			rs.close();
			pstmt.close();
		}catch(Exception e){
			try{
				throw new Exception("操作出现异常");
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}finally{
			dbc.close();
		}
		return all;
	}

	@Override
	public User getUserById(Serializable uid) {
		// TODO Auto-generated method stub
		User user = null;
		String sql = "select * from S_User u where u.userID=?";
		PreparedStatement pstmt = null;
		DBUtils dbc = null;
		try{
			dbc = new DBUtils();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(uid.toString()));
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				user = new User();
				user.setUserID(rs.getLong("userid"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setSex(rs.getString("sex"));
				user.setBirthday(rs.getDate("birthday"));
				user.setEducation(rs.getString("education"));
				user.setTelephone(rs.getString("telephone"));
				user.setInterest(rs.getString("interest"));
				user.setPath(rs.getString("path"));
				user.setFilename(rs.getString("filename"));
				user.setRemark(rs.getString("remark"));
			}
			rs.close();
			pstmt.close();
		}catch(Exception e){
			try{
				e.printStackTrace();
				throw new Exception("操作出现异常");
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}finally{
			dbc.close();
		}
		return user;
	}

	@Override
	public void deleteUser(Serializable uid) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		DBUtils dbc = null;
		StringBuilder sql = new StringBuilder();
		sql.append("delete from s_user where userID = ?");
		try{
			dbc = new DBUtils();
			pstmt = dbc.getConnection().prepareStatement(sql.toString());
			pstmt.setInt(1, (Integer)uid);
			pstmt.executeUpdate();
			pstmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dbc.close();
		}
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		String sql = "update s_user set username=?, password=?, setx=?, birthday=?, education=?, telephone=?, interest=?, path=?, filename=?, remark=? where userID=?";
		PreparedStatement pstmt = null;
		DBUtils dbc = null;
		try{
			dbc = new DBUtils();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getSex());
			if(user.getBirthday()!=null){
				pstmt.setDate(4, new Date(user.getBirthday().getTime()));
			}else{
				pstmt.setDate(4, null);
			}
			pstmt.setString(5, user.getEducation());
			pstmt.setString(6, user.getTelephone());
			pstmt.setString(7, user.getInterest());
			pstmt.setString(8, user.getPath());
			pstmt.setString(9, user.getFilename());
			pstmt.setString(10, user.getRemark());
			pstmt.setInt(11, Integer.parseInt(user.getUserID().toString()));
			pstmt.executeUpdate();
			pstmt.close();
		}catch(Exception e){
			try{
				e.printStackTrace();
				throw new Exception("操作出现异常");
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}finally{
			dbc.close();
		}
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into s_user(username, password, sex, birthday, education, telephone, interest, path, filename, remark) values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		DBUtils dbc = null;
		try{
			dbc = new DBUtils();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getSex());
			pstmt.setDate(4, new Date(user.getBirthday().getTime()));
			pstmt.setString(5,  user.getEducation());
			pstmt.setString(6,  user.getTelephone());
			pstmt.setString(7, user.getInterest());
			pstmt.setString(8, user.getPath());
			pstmt.setString(9,  user.getFilename());
			pstmt.setString(10, user.getRemark());
			pstmt.setInt(11,  Integer.parseInt(user.getUserID().toString()));
			pstmt.executeUpdate();
			pstmt.close();
		}catch(Exception e){
			try{
				e.printStackTrace();
				throw new Exception("操作出现异常");
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}finally{
			dbc.close();
		}
	}

}
