package com.it.dao;

import java.util.List;
import java.util.Map;

import com.it.entity.SmsUser;

public interface SmsUserDao {

	// 通过userid获取对象
	public SmsUser getUserByid(int userid);

	// 获取数据库中所有用户信息
	public List<SmsUser> getUsers();

	// 向数据库中插入用户信息
	public int insertUser(SmsUser user);

	// 通过userid修改指定用户信息
	public int updateInfo(SmsUser user);

	// 通过userid删除指定用户信息
	public int deleteUser(int userid);

	// 通过userid和username找寻到用户密码
	public String getUserPsw(int userid, String username);

	// 使用模糊查询
	public List<SmsUser> getUserInfo(String username);

	// 通过in查询得到相应的用户信息
	public List<SmsUser> getSomeUsers(Map map);
	
	//通过模糊查询，userid和username
	public List<SmsUser> findUserInfo(SmsUser user);
	
	
	//foreach循环
	public List<SmsUser> getListUser(List<Integer> list);
	
	
	//数组循环
	public List<SmsUser> getListUser1(int[] arrs);

}
